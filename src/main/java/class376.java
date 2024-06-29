import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class376 {
   @OriginalMember(
      owner = "client!ai",
      name = "r",
      descriptor = "I"
   )
   public int field5486 = -1;
   @OriginalMember(
      owner = "client!ai",
      name = "i",
      descriptor = "I"
   )
   public int field5497 = 512;
   @OriginalMember(
      owner = "client!ai",
      name = "b",
      descriptor = "I"
   )
   public int field5496 = 1190717;
   @OriginalMember(
      owner = "client!ai",
      name = "o",
      descriptor = "Z"
   )
   public boolean field5489 = false;
   @OriginalMember(
      owner = "client!ai",
      name = "q",
      descriptor = "I"
   )
   public int field5488 = 64;
   @OriginalMember(
      owner = "client!ai",
      name = "n",
      descriptor = "Z"
   )
   public boolean field5493 = true;
   @OriginalMember(
      owner = "client!ai",
      name = "t",
      descriptor = "I"
   )
   public int field5501 = -1;
   @OriginalMember(
      owner = "client!ai",
      name = "k",
      descriptor = "I"
   )
   public int field5503 = 8;
   @OriginalMember(
      owner = "client!ai",
      name = "g",
      descriptor = "I"
   )
   public int field5498 = 127;
   @OriginalMember(
      owner = "client!ai",
      name = "m",
      descriptor = "Z"
   )
   public boolean field5500 = true;
   @OriginalMember(
      owner = "client!ai",
      name = "d",
      descriptor = "I"
   )
   public int field5504 = 0;
   @OriginalMember(
      owner = "client!ai",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5506 = new String[]{method2940(method2939("\u0004\u0014DJ\u0013")), method2940(method2939("\u000b\b\u0006d")), method2940(method2939("\u001eSD&F")), method2940(method2939("\u0004\u0014DK\u0013")), method2940(method2939("\u0004\u0014DI\u0013")), method2940(method2939("\u0004\u0014DL\u0013"))};
   @OriginalMember(
      owner = "client!ai",
      name = "s",
      descriptor = "F"
   )
   public static float field5492;
   @OriginalMember(
      owner = "client!ai",
      name = "c",
      descriptor = "I"
   )
   public static int field5491;
   @OriginalMember(
      owner = "client!ai",
      name = "h",
      descriptor = "I"
   )
   public static int field5494;
   @OriginalMember(
      owner = "client!ai",
      name = "a",
      descriptor = "I"
   )
   public static int field5495;
   @OriginalMember(
      owner = "client!ai",
      name = "f",
      descriptor = "I"
   )
   public int field5499;
   @OriginalMember(
      owner = "client!ai",
      name = "e",
      descriptor = "I"
   )
   public static int field5502;
   @OriginalMember(
      owner = "client!ai",
      name = "l",
      descriptor = "Lgl;"
   )
   public static class282 field5490;
   @OriginalMember(
      owner = "client!ai",
      name = "p",
      descriptor = "Lafa;"
   )
   public static class619 field5487;
   @OriginalMember(
      owner = "client!ai",
      name = "j",
      descriptor = "Lro;"
   )
   public class759 field5505;

   @OriginalMember(
      owner = "client!ai",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public final void method2935(class65 arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field5502;
         if (arg1 < 83) {
            field5487 = null;
         }

         do {
            int var4 = arg0.method665(false);
            if (var4 == 0) {
               break;
            }

            this.method2937(var4, arg0, (byte)-86);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field5506[4] + (arg0 != null ? field5506[2] : field5506[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ai",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2936(int arg0) {
      try {
         if (arg0 != -18299) {
            this.field5501 = 40;
         }

         this.field5503 = this.field5503 << 8 | this.field5499;
         ++field5491;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5506[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ai",
      name = "a",
      descriptor = "(ILcu;B)V"
   )
   private final void method2937(int arg0, class65 arg1, byte arg2) {
      boolean var4 = client.field10022;

      try {
         label119: {
            if (~arg0 == -2) {
               this.field5504 = class181.method1641(arg1.method691((byte)-128), true);
               if (!var4) {
                  break label119;
               }
            }

            if (arg0 != 2) {
               if (arg0 == 3) {
                  this.field5486 = arg1.method685(-2);
                  if (~this.field5486 != -65536) {
                     break label119;
                  }

                  this.field5486 = -1;
                  if (!var4) {
                     break label119;
                  }
               }

               if (arg0 == 5) {
                  this.field5500 = false;
                  if (!var4) {
                     break label119;
                  }
               }

               if (arg0 == 7) {
                  this.field5501 = class181.method1641(arg1.method691((byte)-127), true);
                  if (!var4) {
                     break label119;
                  }
               }

               if (arg0 == 8) {
                  this.field5505.field10848 = this.field5499;
                  if (!var4) {
                     break label119;
                  }
               }

               if (arg0 != 9) {
                  if (~arg0 != -11) {
                     if (~arg0 == -12) {
                        this.field5503 = arg1.method665(false);
                        if (!var4) {
                           break label119;
                        }
                     }

                     if (arg0 == 12) {
                        this.field5489 = true;
                        if (!var4) {
                           break label119;
                        }
                     }

                     if (arg0 != 13) {
                        if (~arg0 == -15) {
                           this.field5488 = arg1.method665(false) << 2;
                           if (!var4) {
                              break label119;
                           }
                        }

                        if (arg0 != 16) {
                           break label119;
                        }

                        this.field5498 = arg1.method665(false);
                        if (!var4) {
                           break label119;
                        }
                     }

                     this.field5496 = arg1.method691((byte)-126);
                     if (!var4) {
                        break label119;
                     }
                  }

                  this.field5493 = false;
                  if (!var4) {
                     break label119;
                  }
               }

               this.field5497 = arg1.method685(-2) << 2;
               if (!var4) {
                  break label119;
               }
            }

            this.field5486 = arg1.method665(false);
         }

         ++field5494;
         if (arg2 != -86) {
            this.method2935((class65)null, -59);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field5506[3] + arg0 + ',' + (arg1 != null ? field5506[2] : field5506[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ai",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2938(byte arg0) {
      try {
         field5490 = null;
         if (arg0 < -124) {
            field5487 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5506[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ai",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2939(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ai",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2940(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
