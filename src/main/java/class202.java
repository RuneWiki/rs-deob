import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class202 {
   @OriginalMember(
      owner = "client!kk",
      name = "j",
      descriptor = "Lqh;"
   )
   private class74 field2477;
   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "I"
   )
   private int field2479;
   @OriginalMember(
      owner = "client!kk",
      name = "e",
      descriptor = "[[I"
   )
   private int[][] field2485;
   @OriginalMember(
      owner = "client!kk",
      name = "f",
      descriptor = "[Z"
   )
   private boolean[] field2482;
   @OriginalMember(
      owner = "client!kk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2486 = new String[]{method1525(method1524("8\u0017\fS,")), method1525(method1524("(R\fA8-PVCy")), method1525(method1524("-LN\u0011")), method1525(method1524("(R\f9y")), method1525(method1524("(R\f>y")), method1525(method1524("(R\f?y")), method1525(method1524("(R\f<y"))};
   @OriginalMember(
      owner = "client!kk",
      name = "h",
      descriptor = "Ldia;"
   )
   public static class245 field2476 = new class245(8);
   @OriginalMember(
      owner = "client!kk",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field2483 = new int[8];
   @OriginalMember(
      owner = "client!kk",
      name = "d",
      descriptor = "I"
   )
   public static int field2478;
   @OriginalMember(
      owner = "client!kk",
      name = "i",
      descriptor = "I"
   )
   public static int field2480;
   @OriginalMember(
      owner = "client!kk",
      name = "g",
      descriptor = "I"
   )
   public static int field2484;
   @OriginalMember(
      owner = "client!kk",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field2481;

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1520(int arg0) {
      try {
         field2483 = null;
         if (arg0 != 30383) {
            field2476 = null;
         }

         field2476 = null;
         field2481 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2486[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(IB)Ltn;"
   )
   public final class94 method1521(int arg0, byte arg1) {
      try {
         ++field2484;
         int var3 = -88 % ((-79 - arg1) / 44);
         byte[] var4 = this.field2477.method732(arg0, 1, (byte)42);
         class94 var5 = new class94();
         var5.method882(207, new class594(var4));
         return var5;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field2486[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method1522(byte arg0) {
      try {
         int var2 = 66 % ((-66 - arg0) / 37);
         ++field2480;
         return ~this.field2479 != 0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2486[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method1523(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field2478;
         if (~arg0 <= -1 && this.field2485.length > arg0) {
            if (this.field2482[arg0] && ~this.field2485[arg0].length < -2) {
               int var4 = this.field2479 != -1 ? 1 : 0;
               if (arg1 < 69) {
                  return null;
               } else {
                  Random var5 = new Random();
                  int[] var6 = new int[this.field2485[arg0].length];
                  class714.method5199(this.field2485[arg0], 0, var6, 0, var6.length);
                  int var7 = var4;
                  if (!var3 && var6.length <= var4) {
                     return var6;
                  } else {
                     do {
                        int var8 = var4 + class221.method1687(var5, 85, var6.length + -var4);
                        int var9 = var6[var7];
                        var6[var7] = var6[var8];
                        var6[var8] = var9;
                        ++var7;
                     } while(var6.length > var7);

                     return var6;
                  }
               }
            } else {
               return this.field2485[arg0];
            }
         } else {
            return this.field2479 == -1 ? new int[0] : new int[]{this.field2479};
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field2486[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "<init>",
      descriptor = "(Lnc;ILqh;)V"
   )
   public class202(class26 arg0, int arg1, class74 arg2) {
      boolean var4 = client.field4273;
      super();

      try {
         this.field2477 = arg2;
         this.field2477.method727(1, -32767);
         class594 var5 = new class594(this.field2477.method732(0, 0, (byte)80));
         int var6 = var5.method4288((byte)70);
         if (~var6 < -4) {
            this.field2485 = new int[0][];
            this.field2479 = -1;
            this.field2482 = new boolean[0];
         } else {
            boolean var9;
            label237: {
               int var7 = var5.method4288((byte)79);
               class365[] var8 = class581.method4178((byte)120);
               var9 = true;
               if (var8.length != var7) {
                  var9 = false;
                  if (!var4) {
                     break label237;
                  }
               }

               int var10 = 0;
               if (var4 || var8.length > var10) {
                  do {
                     int var11 = var5.method4288((byte)96);
                     if (var8[var10].field5154 != var11) {
                        var9 = false;
                        if (!var4) {
                           break;
                        }
                     }

                     ++var10;
                  } while(var8.length > var10);
               }
            }

            if (!var9) {
               this.field2485 = new int[0][];
               this.field2482 = new boolean[0];
               this.field2479 = -1;
            } else {
               int var12;
               int var13;
               label213: {
                  var12 = var5.method4288((byte)70);
                  var13 = var5.method4288((byte)125);
                  if (var6 <= 2) {
                     this.field2479 = -1;
                     if (!var4) {
                        break label213;
                     }
                  }

                  this.field2479 = var5.method4333(-66);
               }

               int var15;
               label159: {
                  this.field2485 = new int[var13 + 1][];
                  this.field2482 = new boolean[var13 + 1];
                  int var14 = 0;
                  boolean[] var10000;
                  int var10001;
                  boolean var10002;
                  if (var4) {
                     var15 = var5.method4288((byte)94);
                     var10000 = this.field2482;
                     var10001 = var15;
                     var10002 = var5.method4288((byte)93) == 1;
                  } else {
                     if (~var12 >= ~var14) {
                        var15 = 0;
                        if (!var4) {
                           break label159;
                        }
                     } else {
                        var15 = var5.method4288((byte)94);
                     }

                     var10000 = this.field2482;
                     var10001 = var15;
                     var10002 = var5.method4288((byte)93) == 1;
                  }

                  while(true) {
                     label156: {
                        int var16;
                        int var17;
                        label155: {
                           var10000[var10001] = var10002;
                           var16 = var5.method4280(-19104);
                           if (this.field2479 == -1) {
                              this.field2485[var15] = new int[var16];
                              var17 = 0;
                              if (var4) {
                                 this.field2485[var15][var17] = var5.method4280(-19104);
                                 ++var17;
                              }

                              while(true) {
                                 while(var17 < var16) {
                                    this.field2485[var15][var17] = var5.method4280(-19104);
                                    ++var17;
                                 }

                                 if (!var4) {
                                    if (!var4) {
                                       if (!var4) {
                                          break label156;
                                       }

                                       ++var17;
                                       break label155;
                                    }
                                    break;
                                 }

                                 ++var17;
                              }
                           }

                           this.field2485[var15] = new int[var16 + 1];
                           this.field2485[var15][0] = this.field2479;
                           var17 = 0;
                           if (var4) {
                              this.field2485[var15][var17 - -1] = var5.method4280(-19104);
                              ++var17;
                           }
                        }

                        while(true) {
                           while(~var16 < ~var17) {
                              this.field2485[var15][var17 - -1] = var5.method4280(-19104);
                              ++var17;
                           }

                           if (!var4) {
                              break;
                           }

                           ++var17;
                        }
                     }

                     ++var14;
                     if (~var12 >= ~var14) {
                        var15 = 0;
                        if (!var4) {
                           break;
                        }
                     } else {
                        var15 = var5.method4288((byte)94);
                     }

                     var10000 = this.field2482;
                     var10001 = var15;
                     var10002 = var5.method4288((byte)93) == 1;
                  }
               }

               if (var4) {
                  if (this.field2485[var15] == null) {
                     if (this.field2479 == -1) {
                        this.field2485[var15] = new int[0];
                        if (var4) {
                           this.field2485[var15] = new int[]{this.field2479};
                           ++var15;
                        } else {
                           ++var15;
                        }
                     } else {
                        this.field2485[var15] = new int[]{this.field2479};
                        ++var15;
                     }
                  } else {
                     ++var15;
                  }
               }

               while(true) {
                  while(~var15 > ~(var13 - -1)) {
                     if (this.field2485[var15] == null) {
                        if (this.field2479 == -1) {
                           this.field2485[var15] = new int[0];
                           if (var4) {
                              this.field2485[var15] = new int[]{this.field2479};
                              ++var15;
                           } else {
                              ++var15;
                           }
                        } else {
                           this.field2485[var15] = new int[]{this.field2479};
                           ++var15;
                        }
                     } else {
                        ++var15;
                     }
                  }

                  if (!var4) {
                     return;
                  }

                  ++var15;
               }
            }
         }
      } catch (RuntimeException var19) {
         throw class534.method3846(var19, field2486[1] + (arg0 != null ? field2486[0] : field2486[2]) + ',' + arg1 + ',' + (arg2 != null ? field2486[0] : field2486[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1524(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1525(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 67;
            break;
         case 1:
            var10005 = 57;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
