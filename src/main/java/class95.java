import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class95 extends class70 {
   @OriginalMember(
      owner = "client!pea",
      name = "R",
      descriptor = "I"
   )
   private int field1337 = 2048;
   @OriginalMember(
      owner = "client!pea",
      name = "P",
      descriptor = "I"
   )
   private int field1338 = 4096;
   @OriginalMember(
      owner = "client!pea",
      name = "O",
      descriptor = "I"
   )
   private int field1340 = 0;
   @OriginalMember(
      owner = "client!pea",
      name = "H",
      descriptor = "I"
   )
   private int field1345 = 12288;
   @OriginalMember(
      owner = "client!pea",
      name = "N",
      descriptor = "I"
   )
   private int field1343 = 8192;
   @OriginalMember(
      owner = "client!pea",
      name = "I",
      descriptor = "I"
   )
   private int field1347 = 2048;
   @OriginalMember(
      owner = "client!pea",
      name = "K",
      descriptor = "I"
   )
   private int field1344 = 0;
   @OriginalMember(
      owner = "client!pea",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1348 = new String[]{method945(method944("L25`")), method945(method944("Yiw\"7")), method945(method944("R\"8\"\u0002\n")), method945(method944("R\"8\"\u000e\n")), method945(method944("R\"8\"\u000b\n")), method945(method944("R\"8\"\b\n")), method945(method944("R\"8\"\u000f\n")), method945(method944("R\"8\"\t\n"))};
   @OriginalMember(
      owner = "client!pea",
      name = "Q",
      descriptor = "I"
   )
   public static int field1334;
   @OriginalMember(
      owner = "client!pea",
      name = "T",
      descriptor = "I"
   )
   public static int field1335;
   @OriginalMember(
      owner = "client!pea",
      name = "J",
      descriptor = "I"
   )
   public static int field1336;
   @OriginalMember(
      owner = "client!pea",
      name = "S",
      descriptor = "I"
   )
   public static int field1339;
   @OriginalMember(
      owner = "client!pea",
      name = "G",
      descriptor = "I"
   )
   public static int field1341;
   @OriginalMember(
      owner = "client!pea",
      name = "L",
      descriptor = "I"
   )
   public static int field1342;
   @OriginalMember(
      owner = "client!pea",
      name = "M",
      descriptor = "I"
   )
   public static int field1346;

   @OriginalMember(
      owner = "client!pea",
      name = "b",
      descriptor = "(III)Z",
      line = 3
   )
   private final boolean method941(int arg0, int arg1, int arg2) {
      try {
         ++field1342;
         int var4 = (-arg1 + arg2) * this.field1345 >> 12;
         if (arg0 != 2048) {
            return false;
         } else {
            int var5 = class594.field8746[(1045319 & var4 * 255) >> 12];
            int var6 = (var5 << 12) / this.field1345;
            int var7 = (var6 << 12) / this.field1343;
            int var8 = this.field1338 * var7 >> 12;
            return arg1 + arg2 < var8 && ~(-var8) > ~(arg1 + arg2);
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field1348[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pea",
      name = "<init>",
      descriptor = "()V",
      line = 225
   )
   public class95() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!pea",
      name = "a",
      descriptor = "(IILica;)V",
      line = 30
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      boolean var4 = client.field1786;

      try {
         label82: {
            label81: {
               label80: {
                  label79: {
                     label78: {
                        label77: {
                           label76: {
                              ++field1335;
                              if (arg1 != 0) {
                                 if (arg1 == 1) {
                                    break label76;
                                 }

                                 if (~arg1 == -3) {
                                    break label77;
                                 }

                                 if (~arg1 == -4) {
                                    break label78;
                                 }

                                 if (arg1 == 4) {
                                    break label79;
                                 }

                                 if (arg1 == 5) {
                                    break label80;
                                 }

                                 if (~arg1 != -7) {
                                    break label82;
                                 }

                                 if (!var4) {
                                    break label81;
                                 }
                              }

                              this.field1347 = arg2.method2848(-126);
                              if (!var4) {
                                 break label82;
                              }
                           }

                           this.field1340 = arg2.method2848(arg0 + -126);
                           if (!var4) {
                              break label82;
                           }
                        }

                        this.field1344 = arg2.method2848(arg0 + -119);
                        if (!var4) {
                           break label82;
                        }
                     }

                     this.field1337 = arg2.method2848(-122);
                     if (!var4) {
                        break label82;
                     }
                  }

                  this.field1345 = arg2.method2848(-120);
                  if (!var4) {
                     break label82;
                  }
               }

               this.field1338 = arg2.method2848(-122);
               if (!var4) {
                  break label82;
               }
            }

            this.field1343 = arg2.method2848(arg0 ^ 119);
         }

         if (arg0 != -1) {
            this.field1345 = 107;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field1348[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1348[1] : field1348[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pea",
      name = "c",
      descriptor = "(III)Z",
      line = 115
   )
   private final boolean method942(int arg0, int arg1, int arg2) {
      try {
         ++field1339;
         int var4 = (arg1 - -arg0) * this.field1345 >> 12;
         int var5 = class594.field8746[255 & var4 * 255 >> 12];
         int var6 = (var5 << 12) / this.field1345;
         if (arg2 != 2091257580) {
            return true;
         } else {
            int var7 = (var6 << 12) / this.field1343;
            int var8 = this.field1338 * var7 >> 12;
            return arg1 - arg0 < var8 && ~(-arg0 + arg1) < ~(-var8);
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field1348[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pea",
      name = "a",
      descriptor = "(IIZ)Z",
      line = 136
   )
   public static final boolean method943(int arg0, int arg1, boolean arg2) {
      try {
         ++field1341;
         if (!arg2) {
            field1334 = 51;
         }

         return class290.method2449(-101, arg1, arg0) & class697.method5125(-21955, arg0, arg1);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1348[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pea",
      name = "a",
      descriptor = "(Z)V",
      line = 150
   )
   public final void method275(boolean arg0) {
      try {
         if (!arg0) {
            class452.method3548((byte)-119);
            ++field1336;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1348[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pea",
      name = "a",
      descriptor = "(BI)[I",
      line = 168
   )
   public final int[] method8(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field1346;
         if (arg0 != 87) {
            return null;
         } else {
            int[] var4 = super.field923.method3718(-2, arg1);
            if (super.field923.field7284) {
               int var5 = class204.field3113[arg1] + -2048;
               int var6 = 0;
               if (var3 || ~class678.field10127 < ~var6) {
                  do {
                     int var7 = class199.field3060[var6] + -2048;
                     int var8 = this.field1347 + var7;
                     int var9 = ~var8 <= 2047 ? var8 : var8 + 4096;
                     int var10 = var9 <= 2048 ? var9 : var9 + -4096;
                     int var11 = var5 - -this.field1340;
                     int var12 = ~var11 <= 2047 ? var11 : var11 - -4096;
                     int var13 = ~var12 < -2049 ? var12 + -4096 : var12;
                     int var14 = var7 - -this.field1344;
                     int var15 = var14 >= -2048 ? var14 : var14 + 4096;
                     int var16 = var15 > 2048 ? var15 + -4096 : var15;
                     int var17 = var5 - -this.field1337;
                     int var18 = var17 < -2048 ? var17 + 4096 : var17;
                     int var19 = ~var18 < -2049 ? var18 + -4096 : var18;
                     var4[var6] = !this.method941(2048, var10, var13) ? (this.method942(var16, var19, 2091257580) ? 4096 : 0) : 4096;
                     ++var6;
                  } while(~class678.field10127 < ~var6);
               }
            }

            return var4;
         }
      } catch (RuntimeException var21) {
         throw class482.method3757(var21, field1348[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method944(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method945(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
