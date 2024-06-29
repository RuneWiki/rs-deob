import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class443 {
   @OriginalMember(
      owner = "client!mf",
      name = "q",
      descriptor = "Ltv;"
   )
   private class590 field6141 = new class590(64);
   @OriginalMember(
      owner = "client!mf",
      name = "c",
      descriptor = "Lqh;"
   )
   private class74 field6151;
   @OriginalMember(
      owner = "client!mf",
      name = "j",
      descriptor = "I"
   )
   public int field6154;
   @OriginalMember(
      owner = "client!mf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6155 = new String[]{method3297(method3296("Rc1\n\u0018")), method3297(method3296("Rc1\u000e\u0018")), method3297(method3296("Rc1\t\u0018")), method3297(method3296("Rc1\u0007\u0018")), method3297(method3296("Rc1\f\u0018")), method3297(method3296("Rc1\b\u0018")), method3297(method3296("Rc1\r\u0018")), method3297(method3296("Qps#")), method3297(method3296("D+1aM")), method3297(method3296("Rc1sYQlkq\u0018")), method3297(method3296("Rc1\u000b\u0018"))};
   @OriginalMember(
      owner = "client!mf",
      name = "d",
      descriptor = "[S"
   )
   private static short[] field6144 = new short[]{6798, 8741, 25238, 4626, 4550};
   @OriginalMember(
      owner = "client!mf",
      name = "g",
      descriptor = "[S"
   )
   private static short[] field6147 = new short[]{-10304, 9104, 25485, 4620, 4540};
   @OriginalMember(
      owner = "client!mf",
      name = "i",
      descriptor = "[S"
   )
   private static short[] field6138 = new short[]{-1, -1, -1, -1, -1};
   @OriginalMember(
      owner = "client!mf",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field6149 = false;
   @OriginalMember(
      owner = "client!mf",
      name = "n",
      descriptor = "[[S"
   )
   public static short[][] field6146 = new short[][]{field6144, field6147, field6138};
   @OriginalMember(
      owner = "client!mf",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field6148 = new int[14];
   @OriginalMember(
      owner = "client!mf",
      name = "m",
      descriptor = "I"
   )
   public static int field6139;
   @OriginalMember(
      owner = "client!mf",
      name = "k",
      descriptor = "I"
   )
   public static int field6140;
   @OriginalMember(
      owner = "client!mf",
      name = "o",
      descriptor = "I"
   )
   public static int field6142;
   @OriginalMember(
      owner = "client!mf",
      name = "l",
      descriptor = "I"
   )
   public static int field6143;
   @OriginalMember(
      owner = "client!mf",
      name = "a",
      descriptor = "I"
   )
   public static int field6145;
   @OriginalMember(
      owner = "client!mf",
      name = "f",
      descriptor = "I"
   )
   public static int field6150;
   @OriginalMember(
      owner = "client!mf",
      name = "h",
      descriptor = "I"
   )
   public static int field6153;
   @OriginalMember(
      owner = "client!mf",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field6152;

   @OriginalMember(
      owner = "client!mf",
      name = "a",
      descriptor = "(II)Lbfa;"
   )
   public final class391 method3288(int arg0, int arg1) {
      try {
         ++field6153;
         class590 var3 = this.field6141;
         class391 var4;
         synchronized(this.field6141) {
            var4 = (class391)this.field6141.method4239((long)arg0, 0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class74 var5 = this.field6151;
            byte[] var6;
            synchronized(this.field6151) {
               var6 = this.field6151.method732(arg0, 47, (byte)93);
            }

            if (arg1 <= 54) {
               field6146 = null;
            }

            class391 var7 = new class391();
            if (var6 != null) {
               var7.method2971(new class594(var6), (byte)-67);
            }

            class590 var8 = this.field6141;
            synchronized(this.field6141) {
               this.field6141.method4238(100, var7, (long)arg0);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field6155[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mf",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3289(int arg0) {
      try {
         class590 var2 = this.field6141;
         synchronized(this.field6141) {
            this.field6141.method4244(true);
         }

         ++field6142;
         if (arg0 < 104) {
            method3291(-91, -23, true);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6155[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mf",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method3290(int arg0, int arg1, byte arg2) {
      try {
         ++field6139;
         int var3 = 12 / ((-47 - arg2) / 50);
         return (arg0 & 34) != 0;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6155[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mf",
      name = "a",
      descriptor = "(IIZ)Z"
   )
   public static final boolean method3291(int arg0, int arg1, boolean arg2) {
      try {
         if (arg2) {
            field6148 = null;
         }

         ++field6143;
         return class498.method3605(73, arg1, arg0) || class370.method2863(arg0, arg1, 106);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6155[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mf",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3292(int arg0) {
      try {
         field6152 = null;
         field6138 = null;
         field6147 = null;
         field6146 = null;
         field6144 = null;
         if (arg0 == 805250689) {
            field6148 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6155[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mf",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method3293(boolean arg0, int arg1) {
      try {
         ++field6140;
         class590 var3 = this.field6141;
         synchronized(this.field6141) {
            if (arg0) {
               this.field6141.method4234(2, arg1);
            }
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field6155[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mf",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3294(int arg0) {
      try {
         ++field6150;
         if (arg0 != 0) {
            field6144 = null;
         }

         class590 var2 = this.field6141;
         synchronized(this.field6141) {
            this.field6141.method4245(true);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6155[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mf",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method3295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field4273;

      try {
         ++field6145;
         class565[] var8 = class708.field10278;
         if (arg1 != 683) {
            field6138 = null;
         }

         int var9 = 0;
         if (var7 || ~var8.length < ~var9) {
            do {
               class565 var10 = var8[var9];
               if (var10 != null) {
                  if (var10.field7709 != 2 && !var7) {
                     ++var9;
                  } else {
                     class601.method4384(var10.field7706, arg6 >> 1, var10.field7704, var10.field7714, arg3, arg5, true, arg0 >> 1, var10.field7713 * 2);
                     if (class140.field1862[0] > -1 && class369.field5205 % 20 < 10) {
                        class763 var11 = class206.field2539[var10.field7708];
                        int var12 = arg4 - -class140.field1862[0] + -12;
                        int var13 = class140.field1862[1] + arg2 + -28;
                        var11.method5482(var12, var13);
                        class534.method3842(0, var12 + var11.method2125(), var13 - -var11.method2129(), var13, var12);
                     }

                     ++var9;
                  }
               } else {
                  ++var9;
               }
            } while(~var8.length < ~var9);

         }
      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field6155[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mf",
      name = "<init>",
      descriptor = "(Lnc;ILqh;)V"
   )
   public class443(class26 arg0, int arg1, class74 arg2) {
      try {
         this.field6151 = arg2;
         if (this.field6151 != null) {
            this.field6154 = this.field6151.method727(47, -32767);
         } else {
            this.field6154 = 0;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6155[9] + (arg0 != null ? field6155[8] : field6155[7]) + ',' + arg1 + ',' + (arg2 != null ? field6155[8] : field6155[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3296(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3297(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
