import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class76 {
   @OriginalMember(
      owner = "client!sh",
      name = "f",
      descriptor = "Lhw;"
   )
   private class141 field1334;
   @OriginalMember(
      owner = "client!sh",
      name = "i",
      descriptor = "I"
   )
   private int field1337;
   @OriginalMember(
      owner = "client!sh",
      name = "e",
      descriptor = "[[I"
   )
   private int[][] field1342;
   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "[Z"
   )
   private boolean[] field1339;
   @OriginalMember(
      owner = "client!sh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1343 = new String[]{method793(method792("KI\u0001\u001c|")), method793(method792("KI\u0001\u001e|")), method793(method792("KI\u0001\u001d|")), method793(method792("C\u000f\u0001q)")), method793(method792("KI\u0001c=VH[a|")), method793(method792("VTC3"))};
   @OriginalMember(
      owner = "client!sh",
      name = "d",
      descriptor = "I"
   )
   public static int field1338 = 0;
   @OriginalMember(
      owner = "client!sh",
      name = "b",
      descriptor = "I"
   )
   public static int field1335;
   @OriginalMember(
      owner = "client!sh",
      name = "h",
      descriptor = "I"
   )
   public static int field1336;
   @OriginalMember(
      owner = "client!sh",
      name = "g",
      descriptor = "I"
   )
   public static int field1340;
   @OriginalMember(
      owner = "client!sh",
      name = "c",
      descriptor = "I"
   )
   public static int field1341;

   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "(ZI)Lak;"
   )
   public final class367 method789(boolean arg0, int arg1) {
      try {
         ++field1340;
         byte[] var3 = this.field1334.method1347((byte)127, 1, arg1);
         class367 var4 = new class367();
         var4.method2866(new class473(var3), (byte)-114);
         if (!arg0) {
            this.method791(121, 123);
         }

         return var4;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field1343[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method790(int arg0) {
      try {
         if (arg0 <= 59) {
            return false;
         } else {
            ++field1341;
            return ~this.field1337 != 0;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1343[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method791(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field1335;
         if (~arg0 <= -1 && arg0 < this.field1342.length) {
            if (this.field1339[arg0] && this.field1342[arg0].length > 1) {
               int var4 = ~this.field1337 == 0 ? 0 : 1;
               Random var5 = new Random();
               int[] var6 = new int[this.field1342[arg0].length];
               class365.method2855(this.field1342[arg0], 0, var6, 0, var6.length);
               int var7 = var4;
               int var8;
               int var9;
               if (var3) {
                  var8 = class398.method3070(var6.length + -var4, var5, (byte)45) - -var4;
                  var9 = var6[var4];
                  var6[var4] = var6[var8];
                  var6[var8] = var9;
                  var7 = var4 + 1;
               }

               while(true) {
                  int var10000;
                  int var10001;
                  if (~var7 <= ~var6.length) {
                     var10000 = arg1;
                     var10001 = 21886;
                     if (!var3) {
                        if (arg1 != 21886) {
                           this.field1337 = 37;
                        }

                        return var6;
                     }
                  } else {
                     var10000 = class398.method3070(var6.length + -var4, var5, (byte)45);
                     var10001 = -var4;
                  }

                  var8 = var10000 - var10001;
                  var9 = var6[var7];
                  var6[var7] = var6[var8];
                  var6[var8] = var9;
                  ++var7;
               }
            } else {
               return this.field1342[arg0];
            }
         } else {
            return this.field1337 == -1 ? new int[0] : new int[]{this.field1337};
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field1343[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "<init>",
      descriptor = "(Lca;ILhw;)V"
   )
   public class76(class320 arg0, int arg1, class141 arg2) {
      boolean var4 = client.field4564;
      super();

      try {
         this.field1334 = arg2;
         this.field1334.method1346(1, 0);
         class473 var5 = new class473(this.field1334.method1347((byte)125, 0, 0));
         int var6 = var5.method3564((byte)-111);
         if (var6 > 3) {
            this.field1337 = -1;
            this.field1342 = new int[0][];
            this.field1339 = new boolean[0];
         } else {
            boolean var9;
            label222: {
               int var7 = var5.method3564((byte)-61);
               class485[] var8 = class31.method229(-71);
               var9 = true;
               if (~var8.length == ~var7) {
                  int var10 = 0;
                  if (var4 || var10 < var8.length) {
                     do {
                        int var11 = var5.method3564((byte)-46);
                        if (var8[var10].field7040 != var11) {
                           var9 = false;
                           if (!var4) {
                              break label222;
                           }
                        }

                        ++var10;
                     } while(var10 < var8.length);
                  }

                  if (var4 || !var4) {
                     break label222;
                  }
               }

               var9 = false;
            }

            if (!var9) {
               this.field1337 = -1;
               this.field1339 = new boolean[0];
               this.field1342 = new int[0][];
            } else {
               int var12;
               int var13;
               label201: {
                  var12 = var5.method3564((byte)-100);
                  var13 = var5.method3564((byte)-68);
                  if (var6 > 2) {
                     this.field1337 = var5.method3538(-128);
                     if (!var4) {
                        break label201;
                     }
                  }

                  this.field1337 = -1;
               }

               int var15;
               label147: {
                  this.field1339 = new boolean[var13 - -1];
                  this.field1342 = new int[var13 - -1][];
                  int var14 = 0;
                  if (var4) {
                     var15 = var5.method3564((byte)-123);
                  } else if (var14 >= var12) {
                     var15 = 0;
                     if (!var4) {
                        break label147;
                     }
                  } else {
                     var15 = var5.method3564((byte)-123);
                  }

                  while(true) {
                     label143: {
                        int var16;
                        int var17;
                        label142: {
                           this.field1339[var15] = ~var5.method3564((byte)-51) == -2;
                           var16 = var5.method3565(true);
                           if (~this.field1337 != 0) {
                              this.field1342[var15] = new int[var16 + 1];
                              this.field1342[var15][0] = this.field1337;
                              var17 = 0;
                              if (var4) {
                                 this.field1342[var15][var17 - -1] = var5.method3565(true);
                                 ++var17;
                              }

                              while(true) {
                                 while(var17 < var16) {
                                    this.field1342[var15][var17 - -1] = var5.method3565(true);
                                    ++var17;
                                 }

                                 if (!var4) {
                                    if (!var4) {
                                       if (!var4) {
                                          break label143;
                                       }

                                       ++var17;
                                       break label142;
                                    }
                                    break;
                                 }

                                 ++var17;
                              }
                           }

                           this.field1342[var15] = new int[var16];
                           var17 = 0;
                           if (var4) {
                              this.field1342[var15][var17] = var5.method3565(true);
                              ++var17;
                           }
                        }

                        while(true) {
                           while(~var16 < ~var17) {
                              this.field1342[var15][var17] = var5.method3565(true);
                              ++var17;
                           }

                           if (!var4) {
                              break;
                           }

                           ++var17;
                        }
                     }

                     ++var14;
                     if (var14 >= var12) {
                        var15 = 0;
                        if (!var4) {
                           break;
                        }
                     } else {
                        var15 = var5.method3564((byte)-123);
                     }
                  }
               }

               if (var4) {
                  if (this.field1342[var15] == null) {
                     if (this.field1337 != -1) {
                        this.field1342[var15] = new int[]{this.field1337};
                        if (var4) {
                           this.field1342[var15] = new int[0];
                           ++var15;
                        } else {
                           ++var15;
                        }
                     } else {
                        this.field1342[var15] = new int[0];
                        ++var15;
                     }
                  } else {
                     ++var15;
                  }
               }

               while(true) {
                  while(~(var13 - -1) < ~var15) {
                     if (this.field1342[var15] == null) {
                        if (this.field1337 != -1) {
                           this.field1342[var15] = new int[]{this.field1337};
                           if (var4) {
                              this.field1342[var15] = new int[0];
                              ++var15;
                           } else {
                              ++var15;
                           }
                        } else {
                           this.field1342[var15] = new int[0];
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
         throw class608.method4462(var19, field1343[4] + (arg0 != null ? field1343[3] : field1343[5]) + ',' + arg1 + ',' + (arg2 != null ? field1343[3] : field1343[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method792(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method793(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 56;
            break;
         case 1:
            var10005 = 33;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 95;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
