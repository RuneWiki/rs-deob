import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class274 {
   @OriginalMember(
      owner = "client!oca",
      name = "g",
      descriptor = "I"
   )
   public int field3817 = 512;
   @OriginalMember(
      owner = "client!oca",
      name = "p",
      descriptor = "I"
   )
   public int field3821 = -1;
   @OriginalMember(
      owner = "client!oca",
      name = "o",
      descriptor = "I"
   )
   private int field3818 = 0;
   @OriginalMember(
      owner = "client!oca",
      name = "j",
      descriptor = "Z"
   )
   public boolean field3828 = true;
   @OriginalMember(
      owner = "client!oca",
      name = "m",
      descriptor = "Z"
   )
   public boolean field3829 = true;
   @OriginalMember(
      owner = "client!oca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3830 = new String[]{method2115(method2114("$b\r\u0007")), method2115(method2114("19OEd")), method2115(method2114("%t\u0000EZb")), method2115(method2114("%t\u0000E\\b")), method2115(method2114("%t\u0000EXb")), method2115(method2114("%t\u0000E_b")), method2115(method2114("%t\u0000E[b")), method2115(method2114("%t\u0000E]b"))};
   @OriginalMember(
      owner = "client!oca",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field3825 = new int[32];
   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "I"
   )
   public static int field3814;
   @OriginalMember(
      owner = "client!oca",
      name = "d",
      descriptor = "I"
   )
   public int field3815;
   @OriginalMember(
      owner = "client!oca",
      name = "c",
      descriptor = "I"
   )
   public static int field3816;
   @OriginalMember(
      owner = "client!oca",
      name = "n",
      descriptor = "I"
   )
   public static int field3819;
   @OriginalMember(
      owner = "client!oca",
      name = "k",
      descriptor = "I"
   )
   public static int field3820;
   @OriginalMember(
      owner = "client!oca",
      name = "i",
      descriptor = "I"
   )
   public static int field3822;
   @OriginalMember(
      owner = "client!oca",
      name = "h",
      descriptor = "I"
   )
   public int field3823;
   @OriginalMember(
      owner = "client!oca",
      name = "b",
      descriptor = "I"
   )
   public static int field3824;
   @OriginalMember(
      owner = "client!oca",
      name = "e",
      descriptor = "I"
   )
   public int field3826;
   @OriginalMember(
      owner = "client!oca",
      name = "f",
      descriptor = "I"
   )
   public int field3827;

   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "(IIFILjs;[BIIFFFIZF)V"
   )
   public static final void method2108(int param0, int param1, float param2, int param3, class348 param4, byte[] param5, int param6, int param7, float param8, float param9, float param10, int param11, boolean param12, float param13) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "(Ljj;B)V"
   )
   public final void method2109(class128 arg0, byte arg1) {
      int var3 = client.field4530;

      try {
         while(true) {
            int var4 = arg0.method1104(255);
            if (~var4 != -1) {
               this.method2110((byte)124, var4, arg0);
               if (var3 != 0) {
                  break;
               }

               if (var3 == 0) {
                  continue;
               }
            }

            ++field3816;
            break;
         }

         if (arg1 >= -103) {
            this.field3827 = -93;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field3830[7] + (arg0 != null ? field3830[1] : field3830[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "(BILjj;)V"
   )
   private final void method2110(byte arg0, int arg1, class128 arg2) {
      int var4 = client.field4530;

      try {
         label64: {
            ++field3814;
            if (arg1 == 1) {
               this.field3818 = arg2.method1077(-33);
               this.method2113(-1, this.field3818);
               if (var4 == 0) {
                  break label64;
               }
            }

            if (arg1 == 2) {
               this.field3821 = arg2.method1038((byte)-115);
               if (~this.field3821 != -65536) {
                  break label64;
               }

               this.field3821 = -1;
               if (var4 == 0) {
                  break label64;
               }
            }

            if (~arg1 != -4) {
               if (~arg1 == -5) {
                  this.field3828 = false;
                  if (var4 == 0) {
                     break label64;
                  }
               }

               if (~arg1 != -6) {
                  break label64;
               }

               this.field3829 = false;
               if (var4 == 0) {
                  break label64;
               }
            }

            this.field3817 = arg2.method1038((byte)-119) << 2;
         }

         if (arg0 <= 85) {
            this.method2113(-74, 38);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field3830[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3830[1] : field3830[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "(BIIII)V"
   )
   public static final void method2111(byte arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         label20: {
            ++field3819;
            if (~arg2 >= ~arg3) {
               class47.method372(arg3, class292.field4077[arg4], arg1, (byte)112, arg2);
               if (client.field4530 == 0) {
                  break label20;
               }
            }

            class47.method372(arg2, class292.field4077[arg4], arg1, (byte)95, arg3);
         }

         if (arg0 >= -109) {
            method2111((byte)104, 54, 112, -48, 123);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field3830[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2112(boolean arg0) {
      try {
         if (arg0) {
            field3820 = 20;
         }

         field3825 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3830[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "(II)V"
   )
   private final void method2113(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field3822;
         double var4 = (double)((arg1 & 16732927) >> 16) / 256.0D;
         double var6 = (double)((arg1 & 65304) >> 8) / 256.0D;
         double var8 = (double)(255 & arg1) / 256.0D;
         double var10 = var4;
         if (var6 < var4) {
            var10 = var6;
         }

         if (var10 > var8) {
            var10 = var8;
         }

         double var12 = var4;
         if (var6 > var4) {
            var12 = var6;
         }

         if (var8 > var12) {
            var12 = var8;
         }

         double var14 = 0.0D;
         double var16 = 0.0D;
         double var18 = (var10 + var12) / 2.0D;
         if (var10 != var12) {
            if (var18 < 0.5D) {
               var16 = (-var10 + var12) / (var10 + var12);
            }

            label81: {
               if (var4 != var12) {
                  if (var6 == var12) {
                     var14 = (-var4 + var8) / (var12 - var10) + 2.0D;
                     if (var3 == 0) {
                        break label81;
                     }
                  }

                  if (var8 != var12) {
                     break label81;
                  }

                  var14 = (var4 - var6) / (var12 - var10) + 4.0D;
                  if (var3 == 0) {
                     break label81;
                  }
               }

               var14 = (-var8 + var6) / (var12 - var10);
            }

            if (var18 >= 0.5D) {
               var16 = (var12 - var10) / (2.0D - var12 + -var10);
            }
         }

         double var20;
         label71: {
            this.field3826 = (int)(var16 * 256.0D);
            this.field3815 = (int)(var18 * 256.0D);
            var20 = var14 / 6.0D;
            if (this.field3826 < 0) {
               this.field3826 = 0;
               if (var3 == 0) {
                  break label71;
               }
            }

            if (this.field3826 > 255) {
               this.field3826 = 255;
            }
         }

         label66: {
            if (var18 > 0.5D) {
               this.field3827 = (int)((1.0D - var18) * var16 * 512.0D);
               if (var3 == 0) {
                  break label66;
               }
            }

            this.field3827 = (int)(var16 * var18 * 512.0D);
         }

         label61: {
            if (arg0 < ~this.field3815) {
               this.field3815 = 0;
               if (var3 == 0) {
                  break label61;
               }
            }

            if (~this.field3815 < -256) {
               this.field3815 = 255;
            }
         }

         if (~this.field3827 > -2) {
            this.field3827 = 1;
         }

         this.field3823 = (int)((double)this.field3827 * var20);
      } catch (RuntimeException var23) {
         throw class670.method4877(var23, field3830[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2114(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2115(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 23;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 107;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
