import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class221 {
   @OriginalMember(
      owner = "client!eq",
      name = "d",
      descriptor = "I"
   )
   public int field2833 = 0;
   @OriginalMember(
      owner = "client!eq",
      name = "h",
      descriptor = "I"
   )
   public int field2838 = 0;
   @OriginalMember(
      owner = "client!eq",
      name = "j",
      descriptor = "Ldw;"
   )
   private class748 field2830 = new class748(64);
   @OriginalMember(
      owner = "client!eq",
      name = "f",
      descriptor = "Ltv;"
   )
   private class586 field2839 = null;
   @OriginalMember(
      owner = "client!eq",
      name = "k",
      descriptor = "Leaa;"
   )
   private class526 field2835;
   @OriginalMember(
      owner = "client!eq",
      name = "b",
      descriptor = "Leaa;"
   )
   private class526 field2837;
   @OriginalMember(
      owner = "client!eq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2840 = new String[]{method1684(method1683("\u007f\u0002g{")), method1684(method1683("t\u0006%S\f")), method1684(method1683("jY%9Y")), method1684(method1683("t\u0006%V\f")), method1684(method1683("t\u0006%U\f")), method1684(method1683("t\u0006%T\f")), method1684(method1683("t\u0006%+M\u007f\u001e\u007f)\f"))};
   @OriginalMember(
      owner = "client!eq",
      name = "i",
      descriptor = "I"
   )
   public static int field2834 = 7000;
   @OriginalMember(
      owner = "client!eq",
      name = "c",
      descriptor = "I"
   )
   public static int field2828 = field2834;
   @OriginalMember(
      owner = "client!eq",
      name = "g",
      descriptor = "I"
   )
   public static int field2829;
   @OriginalMember(
      owner = "client!eq",
      name = "e",
      descriptor = "I"
   )
   public static int field2831;
   @OriginalMember(
      owner = "client!eq",
      name = "a",
      descriptor = "I"
   )
   public static int field2836;
   @OriginalMember(
      owner = "client!eq",
      name = "l",
      descriptor = "Lmr;"
   )
   public static class153 field2832;

   @OriginalMember(
      owner = "client!eq",
      name = "a",
      descriptor = "(JI[ILcj;)Ljava/lang/String;"
   )
   public final String method1679(long arg0, int arg1, int[] arg2, class721 arg3) {
      try {
         ++field2836;
         int var6 = -87 % ((arg1 - 56) / 53);
         if (this.field2839 != null) {
            String var7 = this.field2839.method2322(arg2, (byte)-107, arg3, arg0);
            if (var7 != null) {
               return var7;
            }
         }

         return Long.toString(arg0);
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field2840[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2840[2] : field2840[0]) + ',' + (arg3 != null ? field2840[2] : field2840[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eq",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1680(int arg0) {
      try {
         if (arg0 != 32767) {
            method1681(-12, -59, 10, 127, -21, -29, -31, (byte)-34, -33, -108, 116, -72);
         }

         field2832 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2840[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eq",
      name = "a",
      descriptor = "(IIIIIIIBIIII)V"
   )
   public static final void method1681(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10, int arg11) {
      try {
         ++field2829;
         if (class647.method4669(arg4, (byte)-104)) {
            if (arg7 == -49) {
               if (class660.field9568[arg4] == null) {
                  client.method2389(class136.field1744[arg4], -1, arg5, arg10, arg1, arg11, arg0, arg6, arg8, arg9, arg3, arg2);
               } else {
                  client.method2389(class660.field9568[arg4], -1, arg5, arg10, arg1, arg11, arg0, arg6, arg8, arg9, arg3, arg2);
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field2840[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eq",
      name = "a",
      descriptor = "(II)Lmaa;"
   )
   public final class496 method1682(int arg0, int arg1) {
      try {
         ++field2831;
         class496 var3 = (class496)this.field2830.method5454((long)arg0, arg1 + 18260);
         if (var3 != null) {
            return var3;
         } else {
            byte[] var4;
            label29: {
               if (arg0 >= 32768) {
                  var4 = this.field2837.method3899(arg1 + -102, 32767 & arg0, 1);
                  if (client.field4530 == 0) {
                     break label29;
                  }
               }

               var4 = this.field2835.method3899(-96, arg0, 1);
            }

            class496 var5 = new class496();
            var5.field7339 = this;
            if (var4 != null) {
               var5.method3690(new class128(var4), arg1 ^ -2);
            }

            if (arg1 != 1) {
               return null;
            } else {
               if (~arg0 <= -32769) {
                  var5.method3685((byte)-114);
               }

               this.field2830.method5455(-2049, var5, (long)arg0);
               return var5;
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field2840[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eq",
      name = "<init>",
      descriptor = "(ILeaa;Leaa;Ltv;)V"
   )
   public class221(int arg0, class526 arg1, class526 arg2, class586 arg3) {
      try {
         this.field2835 = arg1;
         this.field2839 = arg3;
         this.field2837 = arg2;
         if (this.field2835 != null) {
            this.field2838 = this.field2835.method3875(0, 1);
         }

         if (this.field2837 != null) {
            this.field2833 = this.field2837.method3875(0, 1);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field2840[6] + arg0 + ',' + (arg1 != null ? field2840[2] : field2840[0]) + ',' + (arg2 != null ? field2840[2] : field2840[0]) + ',' + (arg3 != null ? field2840[2] : field2840[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1683(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1684(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
