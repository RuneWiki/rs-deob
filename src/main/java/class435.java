import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class435 {
   @OriginalMember(
      owner = "client!is",
      name = "k",
      descriptor = "Lrr;"
   )
   private class678 field6676;
   @OriginalMember(
      owner = "client!is",
      name = "c",
      descriptor = "[[I"
   )
   private int[][] field6678;
   @OriginalMember(
      owner = "client!is",
      name = "i",
      descriptor = "I"
   )
   private int field6677;
   @OriginalMember(
      owner = "client!is",
      name = "h",
      descriptor = "[Z"
   )
   private boolean[] field6672;
   @OriginalMember(
      owner = "client!is",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6679 = new String[]{method3430(method3429("E?\u0002=\u0002")), method3430(method3429("E?\u0002?\u0002")), method3430(method3429("E?\u00029\u0002")), method3430(method3429("Wb\u0002TW")), method3430(method3429("B9@\u0016")), method3430(method3429("E?\u0002FCB%XD\u0002")), method3430(method3429("E?\u0002;\u0002")), method3430(method3429("E?\u0002>\u0002")), method3430(method3429("E?\u00028\u0002")), method3430(method3429("A$M")), method3430(method3429("E?\u0002<\u0002"))};
   @OriginalMember(
      owner = "client!is",
      name = "j",
      descriptor = "I"
   )
   public static int field6670 = 0;
   @OriginalMember(
      owner = "client!is",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field6674 = new int[1];
   @OriginalMember(
      owner = "client!is",
      name = "f",
      descriptor = "I"
   )
   public static int field6667;
   @OriginalMember(
      owner = "client!is",
      name = "g",
      descriptor = "I"
   )
   public static int field6668;
   @OriginalMember(
      owner = "client!is",
      name = "d",
      descriptor = "I"
   )
   public static int field6669;
   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "I"
   )
   public static int field6671;
   @OriginalMember(
      owner = "client!is",
      name = "e",
      descriptor = "I"
   )
   public static int field6673;
   @OriginalMember(
      owner = "client!is",
      name = "b",
      descriptor = "I"
   )
   public static int field6675;

   @OriginalMember(
      owner = "client!is",
      name = "b",
      descriptor = "(B)V",
      line = 4
   )
   public static void method3422(byte arg0) {
      try {
         field6674 = null;
         if (arg0 > -48) {
            field6670 = -86;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6679[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(I)[Lgv;",
      line = 23
   )
   public static final class12[] method3423(int arg0) {
      try {
         if (arg0 < 78) {
            field6670 = -128;
         }

         ++field6667;
         return new class12[]{class129.field1852, class462.field7027, class169.field2583, class658.field9840, class129.field1851, class734.field10934, class691.field10260};
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6679[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(II)[I",
      line = 34
   )
   public final int[] method3424(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field6675;
         if (arg1 >= 0 && ~this.field6678.length < ~arg1) {
            if (this.field6672[arg1] && ~this.field6678[arg1].length < -2) {
               int var4 = this.field6677 == -1 ? 0 : 1;
               if (arg0 > -63) {
                  return null;
               } else {
                  Random var5 = new Random();
                  int[] var6 = new int[this.field6678[arg1].length];
                  class107.method1029(this.field6678[arg1], 0, var6, 0, var6.length);
                  int var7 = var4;
                  if (!var3 && var4 >= var6.length) {
                     return var6;
                  } else {
                     do {
                        int var8 = var4 + class784.method5696((byte)25, var6.length - var4, var5);
                        int var9 = var6[var7];
                        var6[var7] = var6[var8];
                        var6[var8] = var9;
                        ++var7;
                     } while(var7 < var6.length);

                     return var6;
                  }
               }
            } else {
               return this.field6678[arg1];
            }
         } else {
            return ~this.field6677 == 0 ? new int[0] : new int[]{this.field6677};
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field6679[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!is",
      name = "b",
      descriptor = "(II)Lrb;",
      line = 79
   )
   public final class689 method3425(int arg0, int arg1) {
      try {
         ++field6669;
         byte[] var3 = this.field6676.method5017(1, arg0, (byte)71);
         class689 var4 = new class689();
         var4.method5072((byte)-59, new class354(var3));
         if (arg1 != 3782) {
            this.method3428(true);
         }

         return var4;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6679[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!is",
      name = "b",
      descriptor = "(Z)V",
      line = 95
   )
   public static final void method3426(boolean param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(B)Lgh;",
      line = 138
   )
   public static final class346 method3427(byte arg0) {
      try {
         ++field6673;
         int var1 = 73 / ((-59 - arg0) / 44);

         try {
            return (class346)Class.forName(field6679[9]).newInstance();
         } catch (Throwable var3) {
            return null;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6679[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(Z)Z",
      line = 157
   )
   public final boolean method3428(boolean arg0) {
      try {
         ++field6668;
         if (!arg0) {
            method3426(true);
         }

         return this.field6677 != -1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6679[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!is",
      name = "<init>",
      descriptor = "(Ltv;ILrr;)V",
      line = 167
   )
   public class435(class311 arg0, int arg1, class678 arg2) {
      boolean var4 = client.field1786;
      super();

      try {
         this.field6676 = arg2;
         this.field6676.method4998((byte)-82, 1);
         class354 var5 = new class354(this.field6676.method5017(0, 0, (byte)71));
         int var6 = var5.method2855(-31007);
         if (var6 > 3) {
            this.field6678 = new int[0][];
            this.field6677 = -1;
            this.field6672 = new boolean[0];
         } else {
            boolean var9;
            label243: {
               int var7 = var5.method2855(-31007);
               class783[] var8 = class312.method2597(-78);
               var9 = true;
               if (~var8.length == ~var7) {
                  int var10 = 0;
                  if (var4 || var8.length > var10) {
                     do {
                        int var11 = var5.method2855(-31007);
                        if (~var8[var10].field11502 != ~var11) {
                           var9 = false;
                           if (!var4) {
                              break label243;
                           }
                        }

                        ++var10;
                     } while(var8.length > var10);
                  }

                  if (var4 || !var4) {
                     break label243;
                  }
               }

               var9 = false;
            }

            if (!var9) {
               this.field6677 = -1;
               this.field6672 = new boolean[0];
               this.field6678 = new int[0][];
            } else {
               int var12;
               int var13;
               label222: {
                  var12 = var5.method2855(-31007);
                  var13 = var5.method2855(-31007);
                  if (~var6 < -3) {
                     this.field6677 = var5.method2869(false);
                     if (!var4) {
                        break label222;
                     }
                  }

                  this.field6677 = -1;
               }

               int var15;
               label168: {
                  this.field6672 = new boolean[var13 + 1];
                  this.field6678 = new int[var13 + 1][];
                  int var14 = 0;
                  boolean[] var10000;
                  int var10001;
                  boolean var10002;
                  if (var4) {
                     var15 = var5.method2855(-31007);
                     var10000 = this.field6672;
                     var10001 = var15;
                     var10002 = ~var5.method2855(-31007) == -2;
                  } else {
                     if (~var12 >= ~var14) {
                        var15 = 0;
                        if (!var4) {
                           break label168;
                        }
                     } else {
                        var15 = var5.method2855(-31007);
                     }

                     var10000 = this.field6672;
                     var10001 = var15;
                     var10002 = ~var5.method2855(-31007) == -2;
                  }

                  while(true) {
                     label165: {
                        var10000[var10001] = var10002;
                        int var16 = var5.method2848(-95);
                        int var17;
                        if (this.field6677 != -1) {
                           this.field6678[var15] = new int[var16 + 1];
                           this.field6678[var15][0] = this.field6677;
                           var17 = 0;
                           if (var4) {
                              this.field6678[var15][var17 - -1] = var5.method2848(-98);
                              ++var17;
                           }

                           while(true) {
                              while(~var16 < ~var17) {
                                 this.field6678[var15][var17 - -1] = var5.method2848(-98);
                                 ++var17;
                              }

                              if (!var4) {
                                 if (var4) {
                                    this.field6678[var15] = new int[var16];
                                    var17 = 0;
                                    if (var4) {
                                       this.field6678[var15][var17] = var5.method2848(-102);
                                       ++var17;
                                    }
                                 } else {
                                    if (!var4) {
                                       break label165;
                                    }

                                    ++var17;
                                 }
                                 break;
                              }

                              ++var17;
                           }
                        } else {
                           this.field6678[var15] = new int[var16];
                           var17 = 0;
                           if (var4) {
                              this.field6678[var15][var17] = var5.method2848(-102);
                              ++var17;
                           }
                        }

                        while(true) {
                           while(var17 < var16) {
                              this.field6678[var15][var17] = var5.method2848(-102);
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
                        var15 = var5.method2855(-31007);
                     }

                     var10000 = this.field6672;
                     var10001 = var15;
                     var10002 = ~var5.method2855(-31007) == -2;
                  }
               }

               if (var4) {
                  if (this.field6678[var15] == null) {
                     if (~this.field6677 == 0) {
                        this.field6678[var15] = new int[0];
                        if (var4) {
                           this.field6678[var15] = new int[]{this.field6677};
                           ++var15;
                        } else {
                           ++var15;
                        }
                     } else {
                        this.field6678[var15] = new int[]{this.field6677};
                        ++var15;
                     }
                  } else {
                     ++var15;
                  }
               }

               while(true) {
                  while(var15 < var13 - -1) {
                     if (this.field6678[var15] == null) {
                        if (~this.field6677 == 0) {
                           this.field6678[var15] = new int[0];
                           if (var4) {
                              this.field6678[var15] = new int[]{this.field6677};
                              ++var15;
                           } else {
                              ++var15;
                           }
                        } else {
                           this.field6678[var15] = new int[]{this.field6677};
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
         throw class482.method3757(var19, field6679[5] + (arg0 != null ? field6679[3] : field6679[4]) + ',' + arg1 + ',' + (arg2 != null ? field6679[3] : field6679[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!is",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3429(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!is",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3430(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 44;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 122;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
