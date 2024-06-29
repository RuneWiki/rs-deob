import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public abstract class class401 {
   @OriginalMember(
      owner = "client!uj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5899 = new String[]{method3092(method3091(".0\tR\u001e")), method3092(method3091(".0\tQ\u001e")), method3092(method3091(".0\tW\u001e")), method3092(method3091(".0\tU\u001e")), method3092(method3091("5/Kx")), method3092(method3091(".0\tV\u001e")), method3092(method3091(" t\t:K")), method3092(method3091(".0\tP\u001e"))};
   @OriginalMember(
      owner = "client!uj",
      name = "a",
      descriptor = "Luw;"
   )
   public static class435 field5890 = new class435(57, 8);
   @OriginalMember(
      owner = "client!uj",
      name = "b",
      descriptor = "[F"
   )
   public static float[] field5895 = new float[2];
   @OriginalMember(
      owner = "client!uj",
      name = "k",
      descriptor = "I"
   )
   public static int field5894 = -1;
   @OriginalMember(
      owner = "client!uj",
      name = "f",
      descriptor = "Lgh;"
   )
   public static class572 field5897 = new class572(113, 6);
   @OriginalMember(
      owner = "client!uj",
      name = "d",
      descriptor = "I"
   )
   public static int field5888;
   @OriginalMember(
      owner = "client!uj",
      name = "e",
      descriptor = "I"
   )
   public static int field5889;
   @OriginalMember(
      owner = "client!uj",
      name = "i",
      descriptor = "I"
   )
   public static int field5891;
   @OriginalMember(
      owner = "client!uj",
      name = "j",
      descriptor = "I"
   )
   public static int field5892;
   @OriginalMember(
      owner = "client!uj",
      name = "g",
      descriptor = "I"
   )
   public static int field5893;
   @OriginalMember(
      owner = "client!uj",
      name = "c",
      descriptor = "I"
   )
   public static int field5898;
   @OriginalMember(
      owner = "client!uj",
      name = "h",
      descriptor = "[Lpja;"
   )
   public static class42[] field5896;

   @OriginalMember(
      owner = "client!uj",
      name = "a",
      descriptor = "(ZIIIZIII)V",
      line = 4
   )
   public static final void method3085(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
      try {
         if (arg4) {
            if (~(!arg0 ? class510.field7454.field11152.method684(false) : class510.field7454.field11169.method684(false)) != -1 && ~arg2 != -1 && class621.field9054 < 50 && arg7 != -1) {
               class123.field1969[class621.field9054++] = new class377((byte)(!arg0 ? 2 : 3), arg7, arg2, arg3, arg1, arg6, arg5, (class294)null);
            }

            ++field5888;
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field5899[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uj",
      name = "a",
      descriptor = "(I)V",
      line = 23
   )
   public static void method3086(int arg0) {
      try {
         field5896 = null;
         if (arg0 != 0) {
            method3089((String)null, (byte)98);
         }

         field5890 = null;
         field5897 = null;
         field5895 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5899[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uj",
      name = "a",
      descriptor = "(IJ)V",
      line = 37
   )
   public static final void method3087(int arg0, long arg1) {
      try {
         if (arg0 == 1) {
            ++field5891;

            try {
               Thread.sleep(arg1);
            } catch (InterruptedException var4) {
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5899[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uj",
      name = "a",
      descriptor = "(ZLjava/lang/String;)[B",
      line = 52
   )
   public static final byte[] method3088(boolean arg0, String arg1) {
      try {
         ++field5889;
         int var2 = arg1.length();
         if (~var2 == -1) {
            return new byte[0];
         } else {
            int var4;
            label39: {
               int var3 = var2 + 3 & -4;
               var4 = var3 / 4 * 3;
               if (~(var3 + -2) > ~var2 && ~class226.method1886(arg1.charAt(var3 + -2), false) != 0) {
                  if (~(var3 + -1) > ~var2 && class226.method1886(arg1.charAt(var3 + -1), arg0) != -1) {
                     break label39;
                  }

                  --var4;
                  if (!client.field4564) {
                     break label39;
                  }
               }

               var4 -= 2;
            }

            if (arg0) {
               field5897 = null;
            }

            byte[] var5 = new byte[var4];
            class290.method2250(arg1, 0, var5, -4871);
            return var5;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field5899[7] + arg0 + ',' + (arg1 != null ? field5899[6] : field5899[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uj",
      name = "a",
      descriptor = "(Ljava/lang/String;B)V",
      line = 83
   )
   public static final void method3089(String arg0, byte arg1) {
      try {
         ++field5893;
         if (class511.field7466 != null) {
            ++class375.field5566;
            class542 var2 = class549.method4093((byte)-113, class183.field2790, class126.field2108);
            var2.field7859.method3571(255, class70.method747(arg0, -9));
            var2.field7859.method3546((byte)-112, arg0);
            int var3 = 61 % ((-33 - arg1) / 34);
            class740.method5332(var2, (byte)77);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5899[5] + (arg0 != null ? field5899[6] : field5899[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uj",
      name = "a",
      descriptor = "(IIIIIIB)V",
      line = 102
   )
   public static final void method3090(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
      try {
         if (arg6 >= -32) {
            field5897 = null;
         }

         class53.field1100 = arg4;
         ++field5892;
         class140.field2292 = arg1;
         class15.field235 = arg3;
         class760.field11028 = arg5;
         class477.field6951 = arg0;
         class396.field5820 = arg2;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field5899[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3091(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3092(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
