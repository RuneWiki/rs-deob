import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class292 {
   @OriginalMember(
      owner = "client!uj",
      name = "l",
      descriptor = "[I"
   )
   private int[] field4367;
   @OriginalMember(
      owner = "client!uj",
      name = "i",
      descriptor = "[I"
   )
   private int[] field4366;
   @OriginalMember(
      owner = "client!uj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4378 = new String[]{method2455(method2454("\n}`\u0003A")), method2455(method2454("\n}`\u0000A")), method2455(method2454("\u00049`h\u0014")), method2455(method2454("\u0011b\"*")), method2455(method2454("\n}`\u0004A")), method2455(method2454("_:p")), method2455(method2454("Ct!*T\u0019q( \u000f\u0019)niI")), method2455(method2454("\n}`\u0007A")), method2455(method2454("\n}`z\u0000\u0011~:xA")), method2455(method2454("\n}`\u0005A")), method2455(method2454("\n}`\u0002A"))};
   @OriginalMember(
      owner = "client!uj",
      name = "c",
      descriptor = "[F"
   )
   public static float[] field4376 = new float[4];
   @OriginalMember(
      owner = "client!uj",
      name = "m",
      descriptor = "Lsb;"
   )
   public static class261 field4365 = new class261();
   @OriginalMember(
      owner = "client!uj",
      name = "d",
      descriptor = "I"
   )
   public static int field4364;
   @OriginalMember(
      owner = "client!uj",
      name = "b",
      descriptor = "I"
   )
   private int field4368;
   @OriginalMember(
      owner = "client!uj",
      name = "j",
      descriptor = "I"
   )
   private int field4369;
   @OriginalMember(
      owner = "client!uj",
      name = "h",
      descriptor = "I"
   )
   public static int field4370;
   @OriginalMember(
      owner = "client!uj",
      name = "g",
      descriptor = "I"
   )
   public static int field4371;
   @OriginalMember(
      owner = "client!uj",
      name = "e",
      descriptor = "I"
   )
   private int field4372;
   @OriginalMember(
      owner = "client!uj",
      name = "a",
      descriptor = "I"
   )
   private int field4373;
   @OriginalMember(
      owner = "client!uj",
      name = "f",
      descriptor = "I"
   )
   public static int field4374;
   @OriginalMember(
      owner = "client!uj",
      name = "n",
      descriptor = "I"
   )
   public static int field4375;
   @OriginalMember(
      owner = "client!uj",
      name = "k",
      descriptor = "Lgga;"
   )
   public static class502 field4377;

   @OriginalMember(
      owner = "client!uj",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2448(int arg0) {
      try {
         field4376 = null;
         field4377 = null;
         if (arg0 == 30626) {
            field4365 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4378[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uj",
      name = "a",
      descriptor = "(Z)V"
   )
   private final void method2449(boolean arg0) {
      boolean var2 = client.field10022;

      try {
         if (arg0) {
            this.field4367 = null;
         }

         ++field4370;
         this.field4373 += ++this.field4372;
         int var3 = 0;
         if (var2 || var3 < 256) {
            do {
               int var4;
               label55: {
                  var4 = this.field4367[var3];
                  if (~(var3 & 2) != -1) {
                     if ((1 & var3) != 0) {
                        this.field4368 >>>= 16;
                        if (!var2) {
                           break label55;
                        }
                     }

                     this.field4368 <<= 2;
                     if (!var2) {
                        break label55;
                     }
                  }

                  if (~(1 & var3) == -1) {
                     this.field4368 <<= 13;
                     if (!var2) {
                        break label55;
                     }
                  }

                  this.field4368 >>>= 6;
               }

               this.field4368 += this.field4367[var3 + 128 & 255];
               int var5;
               this.field4367[var3] = var5 = this.field4373 + this.field4368 + this.field4367[class697.method5101(1020, var4) >> 2];
               this.field4366[var3] = this.field4373 = var4 + this.field4367[class697.method5101(var5 >> 8 >> 2, 255)];
               ++var3;
            } while(var3 < 256);

         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field4378[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uj",
      name = "a",
      descriptor = "(ILha;)V"
   )
   public static final void method2450(int arg0, class17 arg1) {
      boolean var2 = client.field10022;

      try {
         ++field4374;
         if ((class687.field9909 >= 2 || class37.field543) && class696.field10048 == null) {
            String var4;
            label128: {
               if (!class37.field543 || class687.field9909 >= 2) {
                  if (!class233.field3613 || !class130.field2085.method4653(81, (byte)-106) || class687.field9909 <= 2) {
                     class272 var3 = class143.field2272;
                     if (var3 == null) {
                        return;
                     }

                     var4 = class327.method2622(-8744, var3);
                     int[] var5 = null;
                     if (!class536.method3997(114, var3.field4159)) {
                        if (var3.field4161 != -1) {
                           var5 = class201.field2882.method5591(var3.field4161, (byte)-84).field8845;
                        } else if (class220.method1904(0, var3.field4159)) {
                           class432 var6 = (class432)class573.field8110.method3101(-1, (long)((int)var3.field4166));
                           if (var6 != null) {
                              class799 var7 = var6.field6345;
                              class302 var8 = var7.field11618;
                              if (var8.field4550 != null) {
                                 var8 = var8.method2501(class344.field5074, -125);
                              }

                              if (var8 != null) {
                                 var5 = var8.field4568;
                              }
                           }
                        } else if (class77.method849(127, var3.field4159)) {
                           class544 var9 = class549.field7834.method3850(3917, (int)(var3.field4166 >>> 32 & 2147483647L));
                           if (var9.field7741 != null) {
                              var9 = var9.method4068(-24716, class344.field5074);
                           }

                           if (var9 != null) {
                              var5 = var9.field7722;
                           }
                        }
                     } else {
                        var5 = class201.field2882.method5591((int)var3.field4166, (byte)-84).field8845;
                     }

                     if (var5 == null) {
                        break label128;
                     }

                     var4 = var4 + class142.method1418(var5, (byte)101);
                     if (!var2) {
                        break label128;
                     }
                  }

                  var4 = class327.method2622(-8744, class143.field2272);
                  if (!var2) {
                     break label128;
                  }
               }

               var4 = class733.field10420 + class765.field10935.method5512(-2, class777.field11340) + class128.field2048 + field4378[5];
            }

            if (arg0 > -40) {
               field4365 = null;
            }

            if (~class687.field9909 < -3) {
               var4 = var4 + field4378[6] + (class687.field9909 + -2) + class765.field10928.method5512(-2, class777.field11340);
            }

            if (class178.field2627 != null) {
               class216 var10 = class178.field2627.method922((byte)-60, arg1);
               if (var10 == null) {
                  var10 = class437.field6409;
               }

               var10.method1863(class201.field2880, class178.field2627.field1332, class141.field2253, class178.field2627.field1461, class134.field2183, class326.field4841, false, class368.field5435, class436.field6381, class178.field2627.field1485, class72.field1169, class178.field2627.field1466, class178.field2627.field1513, class178.field2627.field1452, var4);
               class91.method918(class436.field6381[0], class436.field6381[2], (byte)123, class436.field6381[3], class436.field6381[1]);
            } else if (class273.field4169 != null && class648.field9162 == class343.field5054) {
               int var11 = class437.field6409.method1877(class201.field2880, class674.field9448 + 16, class134.field2183, 0, (byte)64, var4, class141.field2253, class72.field1169, 16777215, class511.field7260 + 4);
               class91.method918(class511.field7260 + 4, class705.field10143.method3430(32, var4) + var11, (byte)123, 16, class674.field9448);
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field4378[4] + arg0 + ',' + (arg1 != null ? field4378[2] : field4378[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uj",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method2451(boolean arg0) {
      try {
         ++field4371;
         if (!arg0) {
            method2450(-27, (class17)null);
         }

         if (this.field4369 == 0) {
            this.method2449(false);
            this.field4369 = 256;
         }

         return this.field4366[--this.field4369];
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4378[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uj",
      name = "a",
      descriptor = "(B)V"
   )
   private final void method2452(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!uj",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method2453(int arg0) {
      try {
         if (~this.field4369 == -1) {
            this.method2449(false);
            this.field4369 = 256;
         }

         ++field4375;
         int var2 = -21 % ((-8 - arg0) / 43);
         return this.field4366[this.field4369 + -1];
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4378[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uj",
      name = "<init>",
      descriptor = "()V"
   )
   private class292() {
   }

   @OriginalMember(
      owner = "client!uj",
      name = "<init>",
      descriptor = "([I)V"
   )
   public class292(int[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!uj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2454(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2455(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 23;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
