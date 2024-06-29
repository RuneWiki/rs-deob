import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class class573 implements class147 {
   @OriginalMember(
      owner = "client!md",
      name = "r",
      descriptor = "Z"
   )
   private boolean field7874 = false;
   @OriginalMember(
      owner = "client!md",
      name = "o",
      descriptor = "Z"
   )
   private boolean field7885;
   @OriginalMember(
      owner = "client!md",
      name = "l",
      descriptor = "I"
   )
   public int field7890;
   @OriginalMember(
      owner = "client!md",
      name = "i",
      descriptor = "I"
   )
   private int field7880;
   @OriginalMember(
      owner = "client!md",
      name = "f",
      descriptor = "Lor;"
   )
   public class670 field7877;
   @OriginalMember(
      owner = "client!md",
      name = "s",
      descriptor = "I"
   )
   public int field7876;
   @OriginalMember(
      owner = "client!md",
      name = "t",
      descriptor = "I"
   )
   public int field7882;
   @OriginalMember(
      owner = "client!md",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7894 = new String[]{method4134(method4133("\u007f&e^.")), method4134(method4133("|7'a")), method4134(method4133("ile#{")), method4134(method4133("\u007f&e1o|+?3.")), method4134(method4133("\u007f&e@.")), method4134(method4133("\u007f&eD.")), method4134(method4133("\u007f&eG.")), method4134(method4133("\u007f&eB.")), method4134(method4133("\u007f&eF.")), method4134(method4133("\u007f&eA.")), method4134(method4133("\u007f&e].")), method4134(method4133("\u007f&eC.")), method4134(method4133("\u007f&eko|#'d|wj")), method4134(method4133("\u007f&e\\.")), method4134(method4133("\u007f&e_."))};
   @OriginalMember(
      owner = "client!md",
      name = "g",
      descriptor = "Lnw;"
   )
   public static class616 field7884 = new class616(81, 8);
   @OriginalMember(
      owner = "client!md",
      name = "q",
      descriptor = "Lnw;"
   )
   public static class616 field7891 = new class616(23, 0);
   @OriginalMember(
      owner = "client!md",
      name = "h",
      descriptor = "I"
   )
   public static int field7873;
   @OriginalMember(
      owner = "client!md",
      name = "a",
      descriptor = "I"
   )
   public static int field7875;
   @OriginalMember(
      owner = "client!md",
      name = "k",
      descriptor = "I"
   )
   public static int field7878;
   @OriginalMember(
      owner = "client!md",
      name = "u",
      descriptor = "I"
   )
   public static int field7879;
   @OriginalMember(
      owner = "client!md",
      name = "b",
      descriptor = "I"
   )
   public static int field7881;
   @OriginalMember(
      owner = "client!md",
      name = "j",
      descriptor = "I"
   )
   public static int field7883;
   @OriginalMember(
      owner = "client!md",
      name = "p",
      descriptor = "I"
   )
   public static int field7886;
   @OriginalMember(
      owner = "client!md",
      name = "d",
      descriptor = "I"
   )
   public static int field7887;
   @OriginalMember(
      owner = "client!md",
      name = "m",
      descriptor = "I"
   )
   public static int field7888;
   @OriginalMember(
      owner = "client!md",
      name = "c",
      descriptor = "I"
   )
   public static int field7889;
   @OriginalMember(
      owner = "client!md",
      name = "e",
      descriptor = "I"
   )
   public static int field7892;
   @OriginalMember(
      owner = "client!md",
      name = "n",
      descriptor = "Lnia;"
   )
   public static class675 field7893;

   @OriginalMember(
      owner = "client!md",
      name = "d",
      descriptor = "(I)I"
   )
   private final int method4122(int arg0) {
      try {
         if (arg0 < 12) {
            this.method4132(false, 40);
         }

         ++field7879;
         int var2 = this.field7877.method4893((byte)-43, this.field7890) * this.field7880;
         return !this.field7885 ? var2 : var2 * 4 / 3;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7894[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "c",
      descriptor = "(B)I"
   )
   public static final int method4123(byte arg0) {
      try {
         if (arg0 <= 28) {
            method4123((byte)15);
         }

         ++field7889;
         return class596.field8301;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7894[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method4124(byte arg0) {
      try {
         ++field7883;
         if (arg0 > 116) {
            if (~this.field7882 < -1) {
               this.field7877.method4904(this.field7882, (byte)-17, this.method4122(21));
               this.field7882 = 0;
            }
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7894[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method4125(byte arg0) {
      try {
         int var2 = -48 / ((11 - arg0) / 37);
         ++field7878;
         if (this.field7877.field9857) {
            int var3 = this.method4122(119);
            this.field7877.method4848(false, this);
            OpenGL.glGenerateMipmapEXT(this.field7876);
            this.field7885 = true;
            this.method4131(10241);
            this.method4128(-16314, var3);
            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7894[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4126(int arg0) {
      try {
         field7884 = null;
         field7891 = null;
         int var1 = 82 % ((38 - arg0) / 63);
         field7893 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7894[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field7892;
         this.method4124((byte)125);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7894[12] + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method4127(byte arg0) {
      try {
         int var2 = 65 / ((arg0 - 19) / 38);
         ++field7873;
         return this.field7882;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7894[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "a",
      descriptor = "(II)V"
   )
   private final void method4128(int arg0, int arg1) {
      try {
         ++field7887;
         if (arg0 != -16314) {
            this.field7882 = 66;
         }

         this.field7877.field9727 -= arg1;
         this.field7877.field9727 += this.method4122(113);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7894[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method4129(int arg0, boolean arg1) {
      try {
         if (arg0 == -1323776991) {
            if (!this.field7874 != !arg1) {
               this.field7874 = arg1;
               this.method4131(10241);
            }

            ++field7881;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7894[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "a",
      descriptor = "(Lkd;IIILhq;Lha;)Z"
   )
   public static final boolean method4130(class297 arg0, int arg1, int arg2, int arg3, class168 arg4, class65 arg5) {
      boolean var6 = client.field4273;

      try {
         ++field7875;
         int var7 = Integer.MAX_VALUE;
         int var8 = Integer.MIN_VALUE;
         int var9 = Integer.MAX_VALUE;
         int var10 = Integer.MIN_VALUE;
         if (arg0.field3896 != null) {
            var8 = (-class618.field8631 + arg0.field3928 - -arg4.field2118) * (-class618.field8639 + class618.field8635) / (-class618.field8631 + class618.field8634) + class618.field8639;
            var10 = class618.field8632 - (arg0.field3933 - (-arg4.field2124 + class618.field8646)) * (-class618.field8640 + class618.field8632) / (class618.field8628 - class618.field8646);
            var9 = -((arg0.field3897 + arg4.field2124 - class618.field8646) * (-class618.field8640 + class618.field8632) / (-class618.field8646 + class618.field8628)) + class618.field8632;
            var7 = (-class618.field8631 + arg4.field2118 + arg0.field3926) * (-class618.field8639 + class618.field8635) / (-class618.field8631 + class618.field8634) + class618.field8639;
         }

         class763 var11 = null;
         int var12 = 0;
         int var13 = 0;
         int var14 = 0;
         int var15 = 0;
         if (~arg0.field3932 != 0) {
            if (arg4.field2119 && arg0.field3895 != -1) {
               var11 = arg0.method2238(arg5, -73, true);
            } else {
               var11 = arg0.method2238(arg5, -82, false);
            }

            if (var11 != null) {
               var12 = arg4.field2120 - (var11.method2125() + 1 >> 1);
               if (var12 < var7) {
                  var7 = var12;
               }

               var13 = arg4.field2120 + (var11.method2125() + 1 >> 1);
               if (var8 < var13) {
                  var8 = var13;
               }

               var14 = arg4.field2121 - (1 + var11.method2129() >> 1);
               if (var14 < var9) {
                  var9 = var14;
               }

               var15 = arg4.field2121 - -(var11.method2129() + 1 >> 1);
               if (~var15 < ~var10) {
                  var10 = var15;
               }
            }
         }

         class84 var16 = null;
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         if (arg1 != 1) {
            return true;
         } else {
            int var20 = 0;
            int var21 = 0;
            int var22 = 0;
            int var23 = 0;
            int var24 = 0;
            if (arg0.field3918 != null) {
               var16 = class413.method3127(arg0.field3912, arg1 + 98);
               if (var16 != null) {
                  label165: {
                     var17 = class632.field8875.method4800((int[])null, 18619, class121.field1528, arg0.field3918, (class763[])null);
                     var18 = (class618.field8635 - class618.field8639) * arg0.field3891 / (-class618.field8631 + class618.field8634) + arg4.field2120;
                     var19 = -((-class618.field8640 + class618.field8632) * arg0.field3892 / (-class618.field8646 + class618.field8628)) + arg4.field2121;
                     if (var11 == null) {
                        var19 -= var16.method820() * var17 / 2;
                        if (!var6) {
                           break label165;
                        }
                     }

                     var19 -= (var11.method2129() >> 1) + var16.method825() * var17;
                  }

                  int var25 = 0;
                  if (var6 || var25 < var17) {
                     do {
                        String var26 = class121.field1528[var25];
                        if (var17 + -1 > var25) {
                           var26 = var26.substring(0, -4 + var26.length());
                        }

                        int var27 = var16.method823(var26);
                        if (~var20 > ~var27) {
                           var20 = var27;
                        }

                        ++var25;
                     } while(var25 < var17);
                  }

                  var21 = arg3 + var18 + -(var20 / 2);
                  if (var7 > var21) {
                     var7 = var21;
                  }

                  var22 = var20 / 2 + arg3 + var18;
                  var23 = var19 - -arg2;
                  if (~var22 < ~var8) {
                     var8 = var22;
                  }

                  if (var23 < var9) {
                     var9 = var23;
                  }

                  var24 = var19 + var17 * var16.method825() - -arg2;
                  if (var10 < var24) {
                     var10 = var24;
                  }
               }
            }

            if (~class618.field8639 >= ~var8 && ~var7 >= ~class618.field8635 && class618.field8640 <= var10 && ~class618.field8632 <= ~var9) {
               class618.method4499(arg5, arg4, arg0);
               if (var11 != null) {
                  if (class595.field8288 > 0 && (~class367.field5175 != 0 && class367.field5175 == arg4.field2123 || ~class701.field10210 != 0 && class701.field10210 == arg0.field3902)) {
                     int var28;
                     label136: {
                        if (~class730.field10685 >= -51) {
                           var28 = class730.field10685 * 2;
                           if (!var6) {
                              break label136;
                           }
                        }

                        var28 = (100 - class730.field10685) * 2;
                     }

                     int var29 = 16776960 | var28 << 24;
                     arg5.method535(7 + var11.method2126() / 2, arg4.field2120, arg4.field2121, var29, true);
                     arg5.method535(5 + var11.method2126() / 2, arg4.field2120, arg4.field2121, var29, true);
                     arg5.method535(3 + var11.method2126() / 2, arg4.field2120, arg4.field2121, var29, true);
                     arg5.method535(var11.method2126() / 2 - -1, arg4.field2120, arg4.field2121, var29, true);
                     arg5.method535(var11.method2126() / 2, arg4.field2120, arg4.field2121, var29, true);
                  }

                  var11.method5482(arg4.field2120 - (var11.method2125() >> 1), arg4.field2121 - (var11.method2129() >> 1));
               }

               if (arg0.field3918 != null && var16 != null) {
                  class266.method2038(arg0, var18, arg4, -15, var20, arg5, var19, var16, var17);
               }

               if (arg0.field3932 != -1 || arg0.field3918 != null) {
                  class623 var30 = new class623(arg4);
                  var30.field8699 = var24;
                  var30.field8708 = var15;
                  var30.field8707 = var22;
                  var30.field8698 = var23;
                  var30.field8697 = var13;
                  var30.field8700 = var12;
                  var30.field8704 = var21;
                  var30.field8705 = var14;
                  class572.field7867.method3859(2, var30);
               }

               return false;
            } else {
               return true;
            }
         }
      } catch (RuntimeException var32) {
         throw class534.method3846(var32, field7894[7] + (arg0 != null ? field7894[2] : field7894[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field7894[2] : field7894[1]) + ',' + (arg5 != null ? field7894[2] : field7894[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "<init>",
      descriptor = "(Lor;IIIZ)V"
   )
   public class573(class670 arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         this.field7885 = arg4;
         this.field7890 = arg2;
         this.field7880 = arg3;
         this.field7877 = arg0;
         this.field7876 = arg1;
         OpenGL.glGenTextures(1, class242.field3027, 0);
         this.field7882 = class242.field3027[0];
         this.method4128(-16314, 0);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field7894[3] + (arg0 != null ? field7894[2] : field7894[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "c",
      descriptor = "(I)V"
   )
   private final void method4131(int arg0) {
      try {
         ++field7888;
         if (arg0 != 10241) {
            this.field7874 = false;
         }

         this.field7877.method4848(false, this);
         if (!this.field7874) {
            OpenGL.glTexParameteri(this.field7876, 10241, !this.field7885 ? 9728 : 9984);
            OpenGL.glTexParameteri(this.field7876, 10240, 9728);
         } else {
            OpenGL.glTexParameteri(this.field7876, 10241, !this.field7885 ? 9729 : 9987);
            OpenGL.glTexParameteri(this.field7876, 10240, 9729);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7894[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method4132(boolean arg0, int arg1) {
      try {
         if (!arg0 != !this.field7885) {
            int var3 = this.method4122(120);
            this.field7885 = true;
            this.method4131(10241);
            this.method4128(-16314, var3);
         }

         if (arg1 > 97) {
            ++field7886;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7894[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method317(int arg0);

   @OriginalMember(
      owner = "client!md",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4133(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!md",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4134(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 66;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
