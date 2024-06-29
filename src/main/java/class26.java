import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class26 extends class166 {
   @OriginalMember(
      owner = "client!nc",
      name = "r",
      descriptor = "Lum;"
   )
   private class550 field289 = new class550();
   @OriginalMember(
      owner = "client!nc",
      name = "t",
      descriptor = "I"
   )
   private int field295 = 256;
   @OriginalMember(
      owner = "client!nc",
      name = "z",
      descriptor = "I"
   )
   private int field298 = 0;
   @OriginalMember(
      owner = "client!nc",
      name = "s",
      descriptor = "I"
   )
   private int field299 = 256;
   @OriginalMember(
      owner = "client!nc",
      name = "K",
      descriptor = "I"
   )
   private int field275;
   @OriginalMember(
      owner = "client!nc",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field300 = new String[]{method190(method189("\u001dIz5a")), method190(method189("\u001dIz<a")), method190(method189("\u001dIz8a")), method190(method189("\u001dIz=a")), method190(method189("\b\u0004zW4")), method190(method189("\u001dIz3a")), method190(method189("\u001d_8\u0015")), method190(method189("\u001dIz0a")), method190(method189("\u001dIz1a")), method190(method189("\u001dIz2a")), method190(method189("\u001dIz>a")), method190(method189("\u001dIz;a")), method190(method189("\u001dIz:a")), method190(method189("\u001dIz?a")), method190(method189("\u001dIz7\b[")), method190(method189("\u001dIzE \u001dC Ga")), method190(method189("\u001dIz)\b[")), method190(method189("\u001dIz)a"))};
   @OriginalMember(
      owner = "client!nc",
      name = "F",
      descriptor = "I"
   )
   public static int field276 = 0;
   @OriginalMember(
      owner = "client!nc",
      name = "u",
      descriptor = "[I"
   )
   public static int[] field294 = new int[2];
   @OriginalMember(
      owner = "client!nc",
      name = "v",
      descriptor = "I"
   )
   public static int field287 = 0;
   @OriginalMember(
      owner = "client!nc",
      name = "y",
      descriptor = "I"
   )
   public static int field274;
   @OriginalMember(
      owner = "client!nc",
      name = "A",
      descriptor = "I"
   )
   public static int field277;
   @OriginalMember(
      owner = "client!nc",
      name = "p",
      descriptor = "I"
   )
   public static int field278;
   @OriginalMember(
      owner = "client!nc",
      name = "I",
      descriptor = "I"
   )
   public static int field279;
   @OriginalMember(
      owner = "client!nc",
      name = "B",
      descriptor = "I"
   )
   public static int field280;
   @OriginalMember(
      owner = "client!nc",
      name = "w",
      descriptor = "I"
   )
   public static int field281;
   @OriginalMember(
      owner = "client!nc",
      name = "n",
      descriptor = "I"
   )
   public static int field283;
   @OriginalMember(
      owner = "client!nc",
      name = "D",
      descriptor = "I"
   )
   public static int field284;
   @OriginalMember(
      owner = "client!nc",
      name = "C",
      descriptor = "I"
   )
   public static int field285;
   @OriginalMember(
      owner = "client!nc",
      name = "m",
      descriptor = "I"
   )
   public static int field286;
   @OriginalMember(
      owner = "client!nc",
      name = "H",
      descriptor = "I"
   )
   public static int field288;
   @OriginalMember(
      owner = "client!nc",
      name = "L",
      descriptor = "I"
   )
   public static int field290;
   @OriginalMember(
      owner = "client!nc",
      name = "q",
      descriptor = "I"
   )
   public static int field292;
   @OriginalMember(
      owner = "client!nc",
      name = "E",
      descriptor = "I"
   )
   private int field293;
   @OriginalMember(
      owner = "client!nc",
      name = "J",
      descriptor = "I"
   )
   public static int field296;
   @OriginalMember(
      owner = "client!nc",
      name = "G",
      descriptor = "Z"
   )
   private boolean field291;
   @OriginalMember(
      owner = "client!nc",
      name = "x",
      descriptor = "Z"
   )
   private boolean field297;
   @OriginalMember(
      owner = "client!nc",
      name = "o",
      descriptor = "[Lvaa;"
   )
   public static class494[] field282;

   @OriginalMember(
      owner = "client!nc",
      name = "a",
      descriptor = "(BLij;)V",
      line = 6
   )
   public final synchronized void method174(byte arg0, class443 arg1) {
      int var3 = client.field4530;

      try {
         ++field274;
         if (var3 != 0) {
            this.field289.method4063(-5);
            --this.field298;
         }

         while(true) {
            if (~this.field298 > -101) {
               if (var3 == 0) {
                  if (arg0 <= 25) {
                     this.method184();
                  }

                  this.field289.method4060(23, arg1);
                  ++this.field298;
                  return;
               }
            } else {
               this.field289.method4063(-5);
            }

            --this.field298;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field300[5] + arg0 + ',' + (arg1 != null ? field300[4] : field300[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "b",
      descriptor = "(I)Lij;",
      line = 26
   )
   private final synchronized class443 method175(int arg0) {
      try {
         ++field280;
         int var2 = 30 % ((arg0 - -60) / 53);
         return (class443)this.field289.method4071((byte)126);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field300[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "d",
      descriptor = "()Lwea;",
      line = 36
   )
   public final class166 method176() {
      try {
         ++field283;
         return null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field300[17] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "a",
      descriptor = "(Z)D",
      line = 45
   )
   public final synchronized double method177(boolean arg0) {
      try {
         ++field285;
         if (~this.field298 > -2) {
            return -1.0D;
         } else if (!arg0) {
            return 1.3401995842152417D;
         } else {
            class443 var2 = (class443)this.field289.method4071((byte)126);
            return var2 == null ? -1.0D : (double)(-((float)var2.field6749[0].length / (float)class335.field4787)) + var2.field6748;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field300[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "a",
      descriptor = "(B)V",
      line = 68
   )
   private final synchronized void method178(byte arg0) {
      try {
         ++field278;
         class443 var2 = this.method175(arg0 + -252);
         if (var2 != null) {
            if (arg0 == 127) {
               var2.method2720(arg0 + -127);
               this.field293 = 0;
               --this.field298;
               class150.field1892.method5610(arg0 + -127, var2.method3350(-20385), var2);
            }
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field300[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "a",
      descriptor = "(I)V",
      line = 93
   )
   public final synchronized void method179(int arg0) {
      int var2 = client.field4530;

      try {
         ++field279;
         if (!this.field297) {
            while(true) {
               class443 var3 = this.method175(77);
               int var10000;
               if (var3 == null) {
                  var10000 = this.field291;
                  if (var2 == 0) {
                     if (var10000 != 0) {
                        this.method2720(0);
                        class150.field1892.method5608(0);
                     }

                     return;
                  }
               } else {
                  var10000 = var3.field6749[0].length + -this.field293;
               }

               if (var10000 > arg0) {
                  this.field293 += arg0;
                  return;
               }

               arg0 -= var3.field6749[0].length - this.field293;
               this.method178((byte)127);
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field300[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "a",
      descriptor = "(BDI)Lij;",
      line = 131
   )
   public final class443 method180(byte arg0, double arg1, int arg2) {
      try {
         class443 var7;
         label18: {
            ++field284;
            long var5 = (long)(this.field275 << 0 | arg2);
            var7 = (class443)class150.field1892.method5607((byte)111, var5);
            if (var7 == null) {
               var7 = new class443(new short[this.field275][arg2], arg1);
               if (client.field4530 == 0) {
                  break label18;
               }
            }

            var7.field6748 = arg1;
            class150.field1892.method5609(var5, (byte)32);
         }

         if (arg0 != 53) {
            method186(true);
         }

         return var7;
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field300[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "a",
      descriptor = "(II)V",
      line = 154
   )
   public final void method181(int arg0, int arg1) {
      try {
         if (arg1 != -1743605280) {
            this.field298 = -74;
         }

         this.field295 = arg0;
         this.field299 = arg0;
         ++field296;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field300[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "c",
      descriptor = "()Lwea;",
      line = 166
   )
   public final class166 method182() {
      try {
         ++field288;
         return null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field300[14] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "e",
      descriptor = "(I)V",
      line = 179
   )
   public final synchronized void method183(int arg0) {
      try {
         if (arg0 <= -119) {
            ++field292;
            this.field291 = true;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field300[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "b",
      descriptor = "()I",
      line = 193
   )
   public final int method184() {
      try {
         ++field277;
         return 1;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field300[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "<init>",
      descriptor = "(I)V",
      line = 333
   )
   public class26(int arg0) {
      try {
         this.field275 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field300[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "a",
      descriptor = "(ZI)V",
      line = 220
   )
   public final synchronized void method185(boolean arg0, int arg1) {
      try {
         this.field297 = arg0;
         ++field281;
         if (arg1 != 2) {
            this.method179(-71);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field300[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "b",
      descriptor = "(Z)V",
      line = 235
   )
   public static void method186(boolean arg0) {
      try {
         field282 = null;
         if (arg0) {
            method186(false);
         }

         field294 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field300[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "b",
      descriptor = "([III)V",
      line = 251
   )
   public final synchronized void method187(int[] arg0, int arg1, int arg2) {
      int var4 = client.field4530;

      try {
         ++field290;
         if (!this.field297) {
            if (this.method175(-122) == null) {
               if (this.field291) {
                  this.method2720(0);
                  class150.field1892.method5608(0);
               }

            } else {
               int var5 = arg1 + arg2;
               if (class532.field7780) {
                  var5 <<= 1;
               }

               byte var6 = 0;
               byte var7 = 0;
               class443 var8;
               if (this.field275 == 2) {
                  var7 = 1;
                  if (var4 != 0) {
                     var8 = this.method175(102);
                     if (var8 == null) {
                        return;
                     }
                  } else {
                     if (~arg1 <= ~var5) {
                        return;
                     }

                     var8 = this.method175(102);
                     if (var8 == null) {
                        return;
                     }
                  }
               } else {
                  if (~arg1 <= ~var5) {
                     return;
                  }

                  var8 = this.method175(102);
                  if (var8 == null) {
                     return;
                  }
               }

               label145:
               do {
                  do {
                     int var10000;
                     int var10001;
                     label136: {
                        short[][] var9 = var8.field6749;
                        if (var4 == 0) {
                           if (~var5 >= ~arg1) {
                              var10000 = var9[0].length;
                              var10001 = this.field293;
                              break label136;
                           }

                           var10000 = this.field293;
                           var10001 = var9[0].length;
                           if (var4 != 0) {
                              break label136;
                           }

                           if (var10000 >= var10001) {
                              var10000 = var9[0].length;
                              var10001 = this.field293;
                              break label136;
                           }
                        }

                        while(true) {
                           if (!class532.field7780) {
                              var10001 = arg1++;
                              arg0[var10001] += var9[var6][this.field293] * this.field295 + var9[var7][this.field293] * this.field299;
                              if (var4 != 0) {
                                 arg0[arg1++] = var9[var6][this.field293] * this.field295;
                                 arg0[arg1++] = var9[var7][this.field293] * this.field299;
                                 ++this.field293;
                              } else {
                                 ++this.field293;
                              }
                           } else {
                              arg0[arg1++] = var9[var6][this.field293] * this.field295;
                              arg0[arg1++] = var9[var7][this.field293] * this.field299;
                              ++this.field293;
                           }

                           if (~var5 >= ~arg1) {
                              var10000 = var9[0].length;
                              var10001 = this.field293;
                              break;
                           }

                           var10000 = this.field293;
                           var10001 = var9[0].length;
                           if (var4 != 0) {
                              break;
                           }

                           if (var10000 >= var10001) {
                              var10000 = var9[0].length;
                              var10001 = this.field293;
                              break;
                           }
                        }
                     }

                     if (var10000 <= var10001) {
                        if (var4 != 0) {
                           var8 = this.method175(127);
                           continue label145;
                        }

                        this.method178((byte)127);
                     }

                     if (~arg1 <= ~var5) {
                        return;
                     }

                     var8 = this.method175(102);
                  } while(var8 != null);

                  return;
               } while(var8 != null);

            }
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field300[16] + (arg0 != null ? field300[4] : field300[6]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "c",
      descriptor = "(Z)I",
      line = 319
   )
   public final synchronized int method188(boolean arg0) {
      try {
         ++field286;
         if (!arg0) {
            this.field295 = 109;
         }

         return this.field298;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field300[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method189(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method190(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 115;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 121;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
