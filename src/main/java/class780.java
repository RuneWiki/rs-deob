import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class780 {
   @OriginalMember(
      owner = "client!hda",
      name = "c",
      descriptor = "Z"
   )
   public boolean field11420 = false;
   @OriginalMember(
      owner = "client!hda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11438 = new String[]{method5646(method5645("\u0004./\u001cgD")), method5646(method5645("\u0017d`\u001c]")), method5646(method5645("\u0002?\"^")), method5646(method5645("\u0004./\u001chD")), method5646(method5645("\u0004./\u001ccD")), method5646(method5645("\u0004./\u001cfD")), method5646(method5645("\u0004./\u001cdD")), method5646(method5645("\u0004./\u001caD")), method5646(method5645("\u0004./\u001ceD")), method5646(method5645("\u0004./\u001cbD"))};
   @OriginalMember(
      owner = "client!hda",
      name = "p",
      descriptor = "I"
   )
   public static int field11423 = 0;
   @OriginalMember(
      owner = "client!hda",
      name = "q",
      descriptor = "I"
   )
   public static int field11421 = 0;
   @OriginalMember(
      owner = "client!hda",
      name = "a",
      descriptor = "[B"
   )
   public static byte[] field11425 = null;
   @OriginalMember(
      owner = "client!hda",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field11427 = new int[]{28, 35, 40, 44};
   @OriginalMember(
      owner = "client!hda",
      name = "k",
      descriptor = "[Lph;"
   )
   public static class668[] field11424 = new class668[4];
   @OriginalMember(
      owner = "client!hda",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field11435 = new int[1];
   @OriginalMember(
      owner = "client!hda",
      name = "n",
      descriptor = "I"
   )
   public static int field11422;
   @OriginalMember(
      owner = "client!hda",
      name = "b",
      descriptor = "I"
   )
   public int field11426;
   @OriginalMember(
      owner = "client!hda",
      name = "i",
      descriptor = "I"
   )
   public static int field11428;
   @OriginalMember(
      owner = "client!hda",
      name = "l",
      descriptor = "I"
   )
   public static int field11429;
   @OriginalMember(
      owner = "client!hda",
      name = "r",
      descriptor = "I"
   )
   public static int field11430;
   @OriginalMember(
      owner = "client!hda",
      name = "e",
      descriptor = "I"
   )
   public static int field11431;
   @OriginalMember(
      owner = "client!hda",
      name = "o",
      descriptor = "I"
   )
   public int field11432;
   @OriginalMember(
      owner = "client!hda",
      name = "j",
      descriptor = "I"
   )
   public static int field11433;
   @OriginalMember(
      owner = "client!hda",
      name = "m",
      descriptor = "I"
   )
   public static int field11434;
   @OriginalMember(
      owner = "client!hda",
      name = "d",
      descriptor = "I"
   )
   public static int field11437;
   @OriginalMember(
      owner = "client!hda",
      name = "f",
      descriptor = "Lab;"
   )
   public class696 field11436;

   @OriginalMember(
      owner = "client!hda",
      name = "a",
      descriptor = "(ZI)I",
      line = 10
   )
   public static final int method5637(boolean arg0, int arg1) {
      try {
         ++field11422;
         if (arg1 != 6407 && arg1 != 34843 && ~arg1 != -34838) {
            if (~arg1 != -6409 && ~arg1 != -34843 && arg1 != 34836) {
               if (arg1 != 6406 && arg1 != 34844) {
                  if (arg1 != 6409 && arg1 != 34846) {
                     if (!arg0) {
                        field11425 = null;
                     }

                     if (arg1 != 6410 && ~arg1 != -34848) {
                        if (~arg1 == -6403) {
                           return 6402;
                        } else {
                           throw new IllegalArgumentException("");
                        }
                     } else {
                        return 6410;
                     }
                  } else {
                     return 6409;
                  }
               } else {
                  return 6406;
               }
            } else {
               return 6408;
            }
         } else {
            return 6407;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field11438[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "b",
      descriptor = "(I)V",
      line = 50
   )
   public static void method5638(int arg0) {
      try {
         field11427 = null;
         field11424 = null;
         field11425 = null;
         if (arg0 != 34846) {
            field11435 = null;
         }

         field11435 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field11438[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "a",
      descriptor = "(BLuda;I)V",
      line = 66
   )
   private final void method5639(byte arg0, class473 arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         label53: {
            if (~arg2 == -2) {
               this.field11432 = arg1.method3565(true);
               if (!var4) {
                  break label53;
               }
            }

            if (arg2 == 2) {
               this.field11426 = arg1.method3577(-2);
               if (!var4) {
                  break label53;
               }
            }

            if (arg2 != 3) {
               if (arg2 != 4) {
                  break label53;
               }

               this.field11432 = -1;
               if (!var4) {
                  break label53;
               }
            }

            this.field11420 = true;
         }

         if (arg0 > -25) {
            this.method5641(91);
         }

         ++field11428;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field11438[6] + arg0 + ',' + (arg1 != null ? field11438[1] : field11438[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "a",
      descriptor = "(Lwk;IIIII)V",
      line = 97
   )
   public static final void method5640(class152 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field4564;

      try {
         class452 var7;
         label59: {
            ++field11431;
            var7 = null;
            class452 var8 = (class452)class487.field7076.method2579(-801);
            if (arg2 != 13779) {
               method5638(-21);
               if (!var6 && var8 == null) {
                  break label59;
               }
            } else if (var8 == null) {
               break label59;
            }

            do {
               if (var8.field6625 == arg4 && var8.field6622 == arg1 && var8.field6613 == arg5 && ~var8.field6616 == ~arg3) {
                  var7 = var8;
                  break;
               }

               var8 = (class452)class487.field7076.method2583(1);
            } while(var8 != null);
         }

         while(var6) {
         }

         if (var7 == null) {
            var7 = new class452();
            var7.field6613 = arg5;
            var7.field6625 = arg4;
            var7.field6616 = arg3;
            var7.field6622 = arg1;
            class487.field7076.method2585(var7, arg2 ^ -13753);
         }

         var7.field6624 = true;
         var7.field6619 = false;
         var7.field6621 = arg0;
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field11438[5] + (arg0 != null ? field11438[1] : field11438[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "a",
      descriptor = "(I)Z",
      line = 137
   )
   public final boolean method5641(int arg0) {
      try {
         if (arg0 != 6406) {
            field11427 = null;
         }

         ++field11437;
         return this.field11436.field10193.method1335((byte)115, this.field11432);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field11438[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "a",
      descriptor = "(Luda;B)V",
      line = 151
   )
   public final void method5642(class473 arg0, byte arg1) {
      boolean var3 = client.field4564;

      try {
         while(true) {
            int var4 = arg0.method3564((byte)-119);
            if (~var4 != -1) {
               this.method5639((byte)-45, arg0, var4);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg1 != -4) {
               field11423 = -47;
            }

            ++field11434;
            break;
         }

      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field11438[3] + (arg0 != null ? field11438[1] : field11438[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "a",
      descriptor = "(ILha;IZ)Ltd;",
      line = 171
   )
   public final class476 method5643(int arg0, class65 arg1, int arg2, boolean arg3) {
      boolean var5 = client.field4564;

      try {
         ++field11433;
         long var6 = (long)(arg1.field1193 << 19 | arg0 << 16 | this.field11432 | (arg3 ? 262144 : 0));
         class476 var8 = (class476)this.field11436.field10209.method1584(var6, arg2 + -1810);
         if (var8 != null) {
            return var8;
         } else if (arg2 != 1811) {
            return null;
         } else if (!this.field11436.field10193.method1335((byte)115, this.field11432)) {
            return null;
         } else {
            class94 var9 = class94.method913(this.field11436.field10193, this.field11432, 0);
            if (var9 != null) {
               var9.field1524 = var9.field1522 = var9.field1526 = var9.field1525 = 0;
               if (arg3) {
                  var9.method905();
               }

               int var10 = 0;
               if (var5) {
                  var9.method910();
                  ++var10;
               }

               while(~arg0 < ~var10) {
                  var9.method910();
                  ++var10;
               }
            }

            class476 var11 = arg1.method307(var9, true);
            if (var11 != null) {
               this.field11436.field10209.method1581(var6, 0, var11);
            }

            return var11;
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field11438[0] + arg0 + ',' + (arg1 != null ? field11438[1] : field11438[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "a",
      descriptor = "(IIIB)V",
      line = 220
   )
   public static final void method5644(int arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field11430;
         if (arg3 <= -17) {
            class531 var4 = class448.field6548[arg0][arg2];
            class733.method5286(var4 == null ? class764.field11096 : var4, arg1, true);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field11438[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5645(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5646(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 50;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
