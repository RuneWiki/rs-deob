import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public abstract class class484 extends class109 {
   @OriginalMember(
      owner = "client!bm",
      name = "F",
      descriptor = "S"
   )
   public short field7364;
   @OriginalMember(
      owner = "client!bm",
      name = "D",
      descriptor = "S"
   )
   public short field7372;
   @OriginalMember(
      owner = "client!bm",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7373 = new String[]{method3770(method3769("\u00037\u001ew9")), method3770(method3769("\u00037\u001e`9")), method3770(method3769("\u001at\u001e\u001cl")), method3770(method3769("\u000f/\\^")), method3770(method3769("\u00037\u001es9")), method3770(method3769("\u00037\u001ee9")), method3770(method3769("\u00037\u001ewPI")), method3770(method3769("\u00037\u001eqPI")), method3770(method3769("\u00037\u001e\u000ex\u000f3D\f9")), method3770(method3769("\u00037\u001evPI")), method3770(method3769("\u00037\u001eq9"))};
   @OriginalMember(
      owner = "client!bm",
      name = "K",
      descriptor = "[Lwo;"
   )
   public static class9[] field7370 = new class9[2048];
   @OriginalMember(
      owner = "client!bm",
      name = "I",
      descriptor = "I"
   )
   public static int field7363;
   @OriginalMember(
      owner = "client!bm",
      name = "J",
      descriptor = "I"
   )
   public static int field7365;
   @OriginalMember(
      owner = "client!bm",
      name = "L",
      descriptor = "I"
   )
   public static int field7366;
   @OriginalMember(
      owner = "client!bm",
      name = "H",
      descriptor = "I"
   )
   public static int field7367;
   @OriginalMember(
      owner = "client!bm",
      name = "E",
      descriptor = "I"
   )
   public static int field7368;
   @OriginalMember(
      owner = "client!bm",
      name = "M",
      descriptor = "I"
   )
   public static int field7369;
   @OriginalMember(
      owner = "client!bm",
      name = "G",
      descriptor = "I"
   )
   public static int field7371;

   @OriginalMember(
      owner = "client!bm",
      name = "i",
      descriptor = "(I)Z",
      line = 5
   )
   public final boolean method738(int arg0) {
      try {
         if (arg0 != 0) {
            this.field7372 = 18;
         }

         ++field7371;
         return class717.field10755[(super.field1505 >> class394.field6180) + -class487.field7409 + class382.field6038][(super.field1494 >> class394.field6180) + -class701.field10446 + class382.field6038];
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7373[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "d",
      descriptor = "(B)Z",
      line = 17
   )
   public final boolean method45(byte arg0) {
      try {
         if (arg0 > -108) {
            this.field7364 = 59;
         }

         ++field7365;
         return false;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7373[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "l",
      descriptor = "(I)V",
      line = 29
   )
   public static void method3767(int arg0) {
      try {
         field7370 = null;
         if (arg0 > 0) {
            method3767(8);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7373[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "a",
      descriptor = "(BJ)Ljava/lang/String;",
      line = 41
   )
   public static final String method3768(byte arg0, long arg1) {
      boolean var3 = client.field1786;

      try {
         ++field7366;
         if (arg1 > 0L && arg1 < 6582952005840035281L) {
            if (~(arg1 % 37L) == -1L) {
               return null;
            } else {
               int var4 = 0;
               long var5 = arg1;
               if (var3) {
                  var5 = arg1 / 37L;
                  ++var4;
               }

               while(true) {
                  while(~var5 != -1L) {
                     var5 /= 37L;
                     ++var4;
                  }

                  if (!var3) {
                     if (arg0 != 8) {
                        return null;
                     }

                     StringBuffer var7 = new StringBuffer(var4);
                     if (!var3 && ~arg1 == -1L) {
                        return var7.reverse().toString();
                     }

                     do {
                        long var8 = arg1;
                        arg1 /= 37L;
                        var7.append(class97.field1365[(int)(-(arg1 * 37L) + var8)]);
                     } while(~arg1 != -1L);

                     return var7.reverse().toString();
                  }

                  ++var4;
               }
            }
         } else {
            return null;
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field7373[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "a",
      descriptor = "(IIILha;ZILbaa;)V",
      line = 79
   )
   public final void method44(int arg0, int arg1, int arg2, class610 arg3, boolean arg4, int arg5, class109 arg6) {
      try {
         ++field7363;
         if (arg1 != 0) {
            this.field7364 = -87;
         }

         throw new IllegalStateException();
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field7373[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7373[2] : field7373[3]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field7373[2] : field7373[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "f",
      descriptor = "(I)V",
      line = 91
   )
   public final void method57(int arg0) {
      try {
         ++field7367;
         int var2 = -62 / ((-51 - arg0) / 60);
         throw new IllegalStateException();
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7373[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "b",
      descriptor = "(Lha;B)Z",
      line = 103
   )
   public final boolean method734(class610 arg0, byte arg1) {
      try {
         ++field7368;
         return arg1 != -59 ? true : class299.method2506(this.method230(2), super.field1505 >> class394.field6180, false, super.field1494 >> class394.field6180, super.field1500);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7373[7] + (arg0 != null ? field7373[2] : field7373[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "a",
      descriptor = "(I[Llja;)I",
      line = 117
   )
   public final int method740(int arg0, class404[] arg1) {
      try {
         if (arg0 != 27084) {
            this.field7372 = 41;
         }

         ++field7369;
         return this.method1040(super.field1494 >> class394.field6180, super.field1505 >> class394.field6180, false, arg1);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7373[9] + arg0 + ',' + (arg1 != null ? field7373[2] : field7373[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "<init>",
      descriptor = "(IIIIIII)V",
      line = 128
   )
   public class484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         this.field7364 = (short)arg5;
         super.field1494 = arg2;
         super.field1506 = (byte)arg3;
         super.field1505 = arg0;
         super.field1495 = arg1;
         super.field1500 = (byte)arg4;
         this.field7372 = (short)arg6;
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field7373[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3769(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3770(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 50;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
