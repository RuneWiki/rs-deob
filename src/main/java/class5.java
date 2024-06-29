import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class5 extends class96 {
   @OriginalMember(
      owner = "client!js",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field69 = new String[]{method41(method40("\u001cjE~!")), method41(method40("\r7E\u0014t")), method41(method40("\u0018l\u0007V")), method41(method40("\u001cjEy!")), method41(method40("\u001cjE{!")), method41(method40("\u001cjE\u007f!")), method41(method40("\u001cjE|!")), method41(method40("\u001cjEx!"))};
   @OriginalMember(
      owner = "client!js",
      name = "C",
      descriptor = "Lfm;"
   )
   public static class164 field54 = new class164(9, -1);
   @OriginalMember(
      owner = "client!js",
      name = "D",
      descriptor = "Lhha;"
   )
   public static class724 field58 = new class724(80, 3);
   @OriginalMember(
      owner = "client!js",
      name = "u",
      descriptor = "Lqca;"
   )
   public static class134 field61 = new class134(0, 0);
   @OriginalMember(
      owner = "client!js",
      name = "q",
      descriptor = "Lhha;"
   )
   public static class724 field67 = new class724(113, -1);
   @OriginalMember(
      owner = "client!js",
      name = "w",
      descriptor = "I"
   )
   public static int field55;
   @OriginalMember(
      owner = "client!js",
      name = "B",
      descriptor = "I"
   )
   public static int field57;
   @OriginalMember(
      owner = "client!js",
      name = "y",
      descriptor = "I"
   )
   public static int field59;
   @OriginalMember(
      owner = "client!js",
      name = "A",
      descriptor = "I"
   )
   public static int field63;
   @OriginalMember(
      owner = "client!js",
      name = "t",
      descriptor = "I"
   )
   public static int field66;
   @OriginalMember(
      owner = "client!js",
      name = "v",
      descriptor = "Lma;"
   )
   public static class148 field68;
   @OriginalMember(
      owner = "client!js",
      name = "x",
      descriptor = "Ljava/lang/String;"
   )
   public String field62;
   @OriginalMember(
      owner = "client!js",
      name = "z",
      descriptor = "[C"
   )
   public char[] field60;
   @OriginalMember(
      owner = "client!js",
      name = "s",
      descriptor = "[C"
   )
   public char[] field65;
   @OriginalMember(
      owner = "client!js",
      name = "E",
      descriptor = "[I"
   )
   public int[] field56;
   @OriginalMember(
      owner = "client!js",
      name = "r",
      descriptor = "[I"
   )
   public int[] field64;

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(CI)I"
   )
   public final int method34(char arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field59;
         if (this.field56 == null) {
            return -1;
         } else {
            int var4 = 0;
            int var5 = -5 / ((arg1 - 57) / 56);
            int var10000;
            if (var3) {
               var10000 = arg0;
            } else if (var4 >= this.field56.length) {
               var10000 = -1;
               if (!var3) {
                  return -1;
               }
            } else {
               var10000 = arg0;
            }

            while(var10000 != this.field65[var4]) {
               ++var4;
               if (var4 >= this.field56.length) {
                  var10000 = -1;
                  if (!var3) {
                     return -1;
                  }
               } else {
                  var10000 = arg0;
               }
            }

            return this.field56[var4];
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field69[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   private final void method35(class65 arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         label99: {
            ++field66;
            if (arg2 != 1) {
               if (arg2 == 2) {
                  label108: {
                     int var5 = arg0.method665(false);
                     this.field64 = new int[var5];
                     this.field60 = new char[var5];
                     int var6 = 0;
                     if (var4) {
                        this.field64[var6] = arg0.method685(class607.method4473(arg1, 1));
                     } else if (var5 <= var6) {
                        if (!var4) {
                           if (!var4) {
                              break label99;
                           }
                           break label108;
                        }
                     } else {
                        this.field64[var6] = arg0.method685(class607.method4473(arg1, 1));
                     }

                     while(true) {
                        byte var7 = arg0.method638(true);
                        this.field60[var6] = ~var7 != -1 ? class571.method4230(var7, -2) : 0;
                        ++var6;
                        if (var5 <= var6) {
                           if (!var4) {
                              if (!var4) {
                                 break label99;
                              }
                              break;
                           }
                        } else {
                           this.field64[var6] = arg0.method685(class607.method4473(arg1, 1));
                        }
                     }
                  }
               }

               if (~arg2 != -4) {
                  break label99;
               }

               label71: {
                  int var8 = arg0.method665(false);
                  this.field56 = new int[var8];
                  this.field65 = new char[var8];
                  int var9 = 0;
                  if (var4) {
                     this.field56[var9] = arg0.method685(-2);
                  } else if (var9 >= var8) {
                     if (!var4) {
                        break label71;
                     }
                  } else {
                     this.field56[var9] = arg0.method685(-2);
                  }

                  while(true) {
                     byte var10 = arg0.method638(true);
                     this.field65[var9] = var10 == 0 ? 0 : class571.method4230(var10, -128);
                     ++var9;
                     if (var9 >= var8) {
                        if (!var4) {
                           break;
                        }
                     } else {
                        this.field56[var9] = arg0.method685(-2);
                     }
                  }
               }

               if (!var4) {
                  break label99;
               }
            }

            this.field62 = arg0.method640((byte)51);
         }

         if (arg1 != -1) {
            this.method36(-94, '!');
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field69[0] + (arg0 != null ? field69[1] : field69[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(IC)I"
   )
   public final int method36(int arg0, char arg1) {
      boolean var3 = client.field10022;

      try {
         ++field63;
         if (this.field64 == null) {
            return -1;
         } else {
            if (arg0 > -79) {
               this.method39(-22);
            }

            int var4 = 0;
            int var10000;
            if (var3) {
               var10000 = ~arg1;
            } else if (this.field64.length <= var4) {
               var10000 = -1;
               if (!var3) {
                  return -1;
               }
            } else {
               var10000 = ~arg1;
            }

            while(var10000 != ~this.field60[var4]) {
               ++var4;
               if (this.field64.length <= var4) {
                  var10000 = -1;
                  if (!var3) {
                     return -1;
                  }
               } else {
                  var10000 = ~arg1;
               }
            }

            return this.field64[var4];
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field69[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(ILcu;)V"
   )
   public final void method37(int arg0, class65 arg1) {
      boolean var3 = client.field10022;

      try {
         ++field57;
         if (arg0 != 0) {
            field67 = null;
         }

         do {
            int var4 = arg1.method665(false);
            if (~var4 == -1) {
               break;
            }

            this.method35(arg1, -1, var4);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field69[7] + arg0 + ',' + (arg1 != null ? field69[1] : field69[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method38(int arg0) {
      try {
         field54 = null;
         field61 = null;
         field67 = null;
         if (arg0 == 0) {
            field68 = null;
            field58 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field69[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method39(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!js",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method40(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!js",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method41(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 58;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
