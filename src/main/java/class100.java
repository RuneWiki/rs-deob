import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class100 {
   @OriginalMember(
      owner = "client!tt",
      name = "c",
      descriptor = "I"
   )
   private int field1285 = 65000;
   @OriginalMember(
      owner = "client!tt",
      name = "i",
      descriptor = "Ldea;"
   )
   private class259 field1294 = null;
   @OriginalMember(
      owner = "client!tt",
      name = "f",
      descriptor = "Ldea;"
   )
   private class259 field1292 = null;
   @OriginalMember(
      owner = "client!tt",
      name = "j",
      descriptor = "I"
   )
   private int field1293;
   @OriginalMember(
      owner = "client!tt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1296 = new String[]{method914(method913("\u0012L\u0011z")), method914(method913("\u0007\u0017S8d")), method914(method913("\bMST1")), method914(method913("\bMSS1")), method914(method913("\bMSR1")), method914(method913("\bMS*p\u0012P\t(1")), method914(method913("\bMSW1")), method914(method913("\bMSbv/M\u000f\u007fw\u001b\u0011")), method914(method913("?X\u001e~|F"))};
   @OriginalMember(
      owner = "client!tt",
      name = "n",
      descriptor = "Z"
   )
   public static boolean field1284 = false;
   @OriginalMember(
      owner = "client!tt",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field1289 = new int[2];
   @OriginalMember(
      owner = "client!tt",
      name = "a",
      descriptor = "Ljh;"
   )
   public static class169 field1291 = new class169();
   @OriginalMember(
      owner = "client!tt",
      name = "h",
      descriptor = "I"
   )
   public static int field1282;
   @OriginalMember(
      owner = "client!tt",
      name = "d",
      descriptor = "I"
   )
   public static int field1283;
   @OriginalMember(
      owner = "client!tt",
      name = "l",
      descriptor = "I"
   )
   public static int field1286;
   @OriginalMember(
      owner = "client!tt",
      name = "m",
      descriptor = "I"
   )
   public static int field1287;
   @OriginalMember(
      owner = "client!tt",
      name = "e",
      descriptor = "I"
   )
   public static int field1288;
   @OriginalMember(
      owner = "client!tt",
      name = "k",
      descriptor = "I"
   )
   public static int field1290;
   @OriginalMember(
      owner = "client!tt",
      name = "g",
      descriptor = "[[[B"
   )
   public static byte[][][] field1295;

   @OriginalMember(
      owner = "client!tt",
      name = "a",
      descriptor = "(IZI[BI)Z"
   )
   private final boolean method908(int param1, boolean param2, int param3, byte[] param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tt",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method909(int arg0) {
      try {
         field1291 = null;
         if (arg0 < -124) {
            field1295 = null;
            field1289 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1296[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tt",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method910(int arg0) {
      if (arg0 == 0) {
         if (class46.field533 == 2) {
            class247.field3099[0].method3343(class305.field4051[0]);
            class247.field3099[1].method3343(class305.field4051[1]);
         } else if (class46.field533 == 3) {
            class247.field3099[0].method3343(class305.field4051[0]);
            class247.field3099[1].method3343(class305.field4051[1]);
            class247.field3099[2].method3343(class305.field4051[2]);
         } else {
            class247.field3099[0].method3343(class305.field4051[0]);
            class247.field3099[1].method3343(class305.field4051[1]);
            class247.field3099[2].method3343(class305.field4051[2]);
            class247.field3099[3].method3343(class305.field4051[3]);
         }
      } else if (arg0 == 1) {
         if (class46.field533 == 2) {
            class247.field3099[0].method3343(class305.field4051[2]);
         } else if (class46.field533 == 3) {
            class247.field3099[0].method3343(class305.field4051[3]);
            class247.field3099[1].method3343(class305.field4051[4]);
         } else {
            class247.field3099[0].method3343(class305.field4051[4]);
            class247.field3099[1].method3343(class305.field4051[5]);
            class247.field3099[2].method3343(class305.field4051[6]);
         }
      } else {
         if (arg0 == 2) {
            if (class46.field533 == 2) {
               class247.field3099[0].method3343(class305.field4051[3]);
               return;
            }

            if (class46.field533 == 3) {
               class247.field3099[0].method3343(class305.field4051[5]);
               return;
            }

            class247.field3099[0].method3343(class305.field4051[7]);
         }

      }
   }

   @OriginalMember(
      owner = "client!tt",
      name = "a",
      descriptor = "(IZ)[B"
   )
   public final byte[] method911(int arg0, boolean arg1) {
      boolean var3 = client.field4273;

      try {
         ++field1283;
         class259 var4 = this.field1292;
         synchronized(this.field1292) {
            try {
               if (~((long)(arg0 * 6 + 6)) < ~this.field1294.method1986(-126)) {
                  return null;
               } else {
                  this.field1294.method1977(6825, (long)(arg0 * 6));
                  this.field1294.method1982(6, class625.field8724, (byte)125, 0);
                  int var6 = ((class625.field8724[0] & 255) << 16) + ((class625.field8724[1] & 255) << 8) + (255 & class625.field8724[2]);
                  int var7 = (255 & class625.field8724[5]) + ((255 & class625.field8724[4]) << 8) + (16711680 & class625.field8724[3] << 16);
                  if (var6 >= 0 && ~this.field1285 <= ~var6) {
                     if (var7 > 0 && (long)var7 <= this.field1292.method1986(-122) / 520L) {
                        if (arg1) {
                           this.method911(-70, true);
                        }

                        byte[] var10 = new byte[var6];
                        int var11 = 0;
                        int var12 = 0;
                        if (var3) {
                           if (~var7 == -1) {
                              return null;
                           }

                           this.field1292.method1977(6825, (long)(var7 * 520));
                        } else if (var6 <= var11) {
                           if (!var3) {
                              return var10;
                           }
                        } else {
                           if (~var7 == -1) {
                              return null;
                           }

                           this.field1292.method1977(6825, (long)(var7 * 520));
                        }

                        while(true) {
                           int var14 = -var11 + var6;
                           if (var14 > 512) {
                              var14 = 512;
                           }

                           this.field1292.method1982(var14 + 8, class625.field8724, (byte)100, 0);
                           int var15 = ((255 & class625.field8724[0]) << 8) - -(255 & class625.field8724[1]);
                           int var16 = (class625.field8724[2] << 8 & 65280) + (255 & class625.field8724[3]);
                           int var17 = ((255 & class625.field8724[4]) << 16) + (65280 & class625.field8724[5] << 8) - -(class625.field8724[6] & 255);
                           int var18 = class625.field8724[7] & 255;
                           if (arg0 != var15 || var12 != var16 || ~this.field1293 != ~var18) {
                              return null;
                           }

                           if (var17 < 0 || (long)var17 > this.field1292.method1986(-125) / 520L) {
                              return null;
                           }

                           int var21 = 0;
                           if (var3) {
                              var10[var11++] = class625.field8724[var21 + 8];
                              ++var21;
                           }

                           while(true) {
                              while(~var21 > ~var14) {
                                 var10[var11++] = class625.field8724[var21 + 8];
                                 ++var21;
                              }

                              if (!var3) {
                                 ++var12;
                                 if (var6 <= var11) {
                                    if (!var3) {
                                       return var10;
                                    }
                                 } else {
                                    if (~var17 == -1) {
                                       return null;
                                    }

                                    this.field1292.method1977(6825, (long)(var17 * 520));
                                 }
                                 break;
                              }

                              ++var21;
                           }
                        }
                     } else {
                        return null;
                     }
                  } else {
                     return null;
                  }
               }
            } catch (IOException var41) {
               return null;
            }
         }
      } catch (RuntimeException var43) {
         throw class534.method3846(var43, field1296[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tt",
      name = "a",
      descriptor = "([BIII)Z"
   )
   public final boolean method912(byte[] arg0, int arg1, int arg2, int arg3) {
      try {
         ++field1287;
         class259 var5 = this.field1292;
         synchronized(this.field1292) {
            if (arg1 != 8) {
               this.method911(82, false);
            }

            if (~arg3 <= -1 && this.field1285 >= arg3) {
               boolean var6 = this.method908(arg2, true, 2, arg0, arg3);
               if (!var6) {
                  var6 = this.method908(arg2, false, 2, arg0, arg3);
               }

               return var6;
            } else {
               throw new IllegalArgumentException();
            }
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field1296[2] + (arg0 != null ? field1296[1] : field1296[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tt",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field1282;
         return field1296[8] + this.field1293;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1296[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tt",
      name = "<init>",
      descriptor = "(ILdea;Ldea;I)V"
   )
   public class100(int arg0, class259 arg1, class259 arg2, int arg3) {
      try {
         this.field1294 = arg2;
         this.field1292 = arg1;
         this.field1285 = arg3;
         this.field1293 = arg0;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field1296[5] + arg0 + ',' + (arg1 != null ? field1296[1] : field1296[0]) + ',' + (arg2 != null ? field1296[1] : field1296[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method913(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method914(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 57;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
