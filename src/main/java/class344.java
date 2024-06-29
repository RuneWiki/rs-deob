import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class344 {
   @OriginalMember(
      owner = "client!saa",
      name = "p",
      descriptor = "Lhc;"
   )
   private class150 field4899 = new class150();
   @OriginalMember(
      owner = "client!saa",
      name = "j",
      descriptor = "Ljava/lang/String;"
   )
   public String field4904;
   @OriginalMember(
      owner = "client!saa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4911 = new String[]{method2666(method2665("o[)>54")), method2666(method2665("o[)>:4")), method2666(method2665("rO$|")), method2666(method2665("o[)>04")), method2666(method2665("g\u0014f>\u000f")), method2666(method2665("o[)>44")), method2666(method2665("o[)>NuT!dL4")), method2666(method2665("o[)>;4")), method2666(method2665("o[)>14")), method2666(method2665("o[)>74")), method2666(method2665("o[)>34")), method2666(method2665("o[)>64"))};
   @OriginalMember(
      owner = "client!saa",
      name = "k",
      descriptor = "I"
   )
   public static int field4901 = -1;
   @OriginalMember(
      owner = "client!saa",
      name = "o",
      descriptor = "Lhc;"
   )
   public static class150 field4908 = new class150();
   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "Lhm;"
   )
   public static class230 field4909 = new class230(8, 0, 4, 1);
   @OriginalMember(
      owner = "client!saa",
      name = "i",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field4910 = new String[5];
   @OriginalMember(
      owner = "client!saa",
      name = "m",
      descriptor = "I"
   )
   public static int field4895;
   @OriginalMember(
      owner = "client!saa",
      name = "l",
      descriptor = "I"
   )
   public static int field4896;
   @OriginalMember(
      owner = "client!saa",
      name = "n",
      descriptor = "I"
   )
   public static int field4897;
   @OriginalMember(
      owner = "client!saa",
      name = "h",
      descriptor = "I"
   )
   public static int field4898;
   @OriginalMember(
      owner = "client!saa",
      name = "q",
      descriptor = "I"
   )
   public static int field4900;
   @OriginalMember(
      owner = "client!saa",
      name = "d",
      descriptor = "I"
   )
   public static int field4902;
   @OriginalMember(
      owner = "client!saa",
      name = "f",
      descriptor = "I"
   )
   public static int field4903;
   @OriginalMember(
      owner = "client!saa",
      name = "b",
      descriptor = "I"
   )
   public static int field4905;
   @OriginalMember(
      owner = "client!saa",
      name = "c",
      descriptor = "I"
   )
   private volatile int field4907;
   @OriginalMember(
      owner = "client!saa",
      name = "e",
      descriptor = "Luk;"
   )
   private class271 field4906;
   @OriginalMember(
      owner = "client!saa",
      name = "g",
      descriptor = "Lwl;"
   )
   public static class427 field4894;
   @OriginalMember(
      owner = "client!saa",
      name = "r",
      descriptor = "Z"
   )
   public static boolean field4893;

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(ICLjava/lang/String;)I"
   )
   public static final int method2656(int arg0, char arg1, String arg2) {
      boolean var3 = client.field4564;

      try {
         ++field4896;
         int var4 = 0;
         int var5 = arg2.length();
         int var6 = 0;
         if (var3) {
            if (arg1 == arg2.charAt(var6)) {
               ++var4;
            }

            ++var6;
         }

         while(true) {
            while(var5 > var6) {
               if (arg1 == arg2.charAt(var6)) {
                  ++var4;
               }

               ++var6;
            }

            if (!var3) {
               if (arg0 != 1) {
                  return 96;
               }

               return var4;
            }

            if (arg0 == 1) {
               ++var4;
            }

            ++var6;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field4911[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4911[4] : field4911[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(ILvca;)V"
   )
   public final void method2657(int arg0, class294 arg1) {
      try {
         ++field4900;
         arg1.field4092 = false;
         class150 var3 = this.field4899;
         synchronized(this.field4899) {
            this.field4899.method1398(true, arg1);
            ++this.field4907;
         }

         if (arg0 != 3) {
            field4894 = null;
         }

         if (this.field4906 != null) {
            class271 var4 = this.field4906;
            synchronized(this.field4906) {
               this.field4906.notify();
            }
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field4911[5] + arg0 + ',' + (arg1 != null ? field4911[4] : field4911[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(BLuk;)V"
   )
   public final void method2658(byte arg0, class271 arg1) {
      try {
         ++field4897;
         this.field4906 = arg1;
         int var3 = -24 % ((-76 - arg0) / 33);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field4911[11] + arg0 + ',' + (arg1 != null ? field4911[4] : field4911[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method2659(byte arg0) {
      try {
         int var2 = -96 % ((7 - arg0) / 43);
         ++field4905;
         return this.field4907 == 0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4911[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(BLvca;)V"
   )
   public final void method2660(byte arg0, class294 arg1) {
      try {
         int var3 = -94 % ((-32 - arg0) / 62);
         arg1.field4092 = true;
         ++field4903;
         class150 var4 = this.field4899;
         synchronized(this.field4899) {
            this.field4899.method1398(true, arg1);
            ++this.field4907;
         }

         if (this.field4906 != null) {
            class271 var5 = this.field4906;
            synchronized(this.field4906) {
               this.field4906.notify();
            }
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field4911[3] + arg0 + ',' + (arg1 != null ? field4911[4] : field4911[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2661(int arg0) {
      try {
         field4894 = null;
         field4910 = null;
         if (arg0 != 3) {
            field4908 = null;
         }

         field4909 = null;
         field4908 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4911[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(IIIIIIIIBI)V"
   )
   public static final void method2662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
      boolean var10 = client.field4564;

      try {
         label47: {
            if (arg0 == arg2 && ~arg3 == ~arg9 && arg5 == arg6 && arg1 == arg4) {
               class653.method4802(arg5, arg9, arg4, arg7, true, arg0);
               if (!var10) {
                  break label47;
               }
            }

            int var11 = arg0;
            int var12 = arg9;
            int var13 = arg0 * 3;
            int var14 = arg9 * 3;
            int var15 = arg2 * 3;
            int var16 = arg3 * 3;
            int var17 = arg6 * 3;
            int var18 = arg1 * 3;
            int var19 = -var17 + arg5 + var15 + -arg0;
            int var20 = arg4 - -var16 + -var18 + -arg9;
            int var21 = var17 - -var13 + -var15 + -var15;
            int var22 = var18 - var16 + -var16 + var14;
            int var23 = -var13 + var15;
            int var24 = -var14 + var16;
            int var25 = 128;
            if (var10 || ~var25 >= -4097) {
               do {
                  int var26 = var25 * var25 >> 12;
                  int var27 = var25 * var26 >> 12;
                  int var28 = var19 * var27;
                  int var29 = var20 * var27;
                  int var30 = var21 * var26;
                  int var31 = var22 * var26;
                  int var32 = var23 * var25;
                  int var33 = var24 * var25;
                  int var34 = (var30 + var32 + var28 >> 12) + arg0;
                  int var35 = (var29 - -var31 + var33 >> 12) + arg9;
                  class653.method4802(var34, var12, var35, arg7, true, var11);
                  var12 = var35;
                  var11 = var34;
                  var25 += 128;
               } while(~var25 >= -4097);
            }
         }

         if (arg8 > 110) {
            ++field4902;
         }
      } catch (RuntimeException var37) {
         throw class608.method4462(var37, field4911[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(Luq;I)V"
   )
   public final void method2663(class169 arg0, int arg1) {
      try {
         class150 var3 = this.field4899;
         synchronized(this.field4899) {
            this.field4899.method1398(true, arg0);
            ++this.field4907;
            if (arg1 != 4514) {
               this.method2663((class169)null, -90);
            }
         }

         ++field4895;
         if (this.field4906 != null) {
            class271 var4 = this.field4906;
            synchronized(this.field4906) {
               this.field4906.notify();
            }
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field4911[8] + (arg0 != null ? field4911[4] : field4911[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(B)Lida;"
   )
   public final class246 method2664(byte arg0) {
      try {
         ++field4898;
         if (arg0 != 82) {
            return null;
         } else {
            Object var2 = null;
            class150 var3 = this.field4899;
            synchronized(this.field4899) {
               class246 var4 = this.field4899.method1394((byte)-120);
               var4.method1995((byte)35);
               --this.field4907;
               return var4;
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field4911[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V"
   )
   public class344(String arg0) {
      try {
         this.field4904 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4911[6] + (arg0 != null ? field4911[4] : field4911[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2665(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!saa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2666(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 58;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
