import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class47 {
   @OriginalMember(
      owner = "client!ed",
      name = "f",
      descriptor = "I"
   )
   public int field614 = -1;
   @OriginalMember(
      owner = "client!ed",
      name = "b",
      descriptor = "I"
   )
   public int field615 = -1;
   @OriginalMember(
      owner = "client!ed",
      name = "c",
      descriptor = "[I"
   )
   public int[] field612;
   @OriginalMember(
      owner = "client!ed",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field621 = new String[]{method337(method336("\u0016d+\u0004B")), method337(method336("\b.+h\u0017")), method337(method336("\u0003?iF")), method337(method336("\b.+\u0016V\u0003#q\u0014\u0017")), method337(method336("\b.+k\u0017")), method337(method336("\b.+i\u0017")), method337(method336("\b.+n\u0017"))};
   @OriginalMember(
      owner = "client!ed",
      name = "h",
      descriptor = "Lnaa;"
   )
   public static class113 field616 = new class113(12, 8);
   @OriginalMember(
      owner = "client!ed",
      name = "d",
      descriptor = "Lsg;"
   )
   public static class742 field619 = new class742();
   @OriginalMember(
      owner = "client!ed",
      name = "g",
      descriptor = "I"
   )
   public static int field610;
   @OriginalMember(
      owner = "client!ed",
      name = "j",
      descriptor = "I"
   )
   public static int field613;
   @OriginalMember(
      owner = "client!ed",
      name = "e",
      descriptor = "I"
   )
   public static int field617;
   @OriginalMember(
      owner = "client!ed",
      name = "l",
      descriptor = "Z"
   )
   public static boolean field620;
   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "[I"
   )
   public int[] field609;
   @OriginalMember(
      owner = "client!ed",
      name = "k",
      descriptor = "[I"
   )
   public int[] field611;
   @OriginalMember(
      owner = "client!ed",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field618;

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method332(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field613;
         if (arg2 != 15989) {
            method335(-12);
         }

         if (~arg3 >= ~arg0) {
            return arg1 < arg0 ? arg1 : arg0;
         } else {
            return arg3;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field621[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(ILica;)V"
   )
   private final void method333(int arg0, class354 arg1) {
      boolean var3 = client.field1786;

      try {
         ++field617;

         label142:
         while(true) {
            int var4;
            label140:
            while(true) {
               var4 = arg1.method2855(arg0 + -31004);
               if (var4 == 0) {
                  if (var3) {
                     break;
                  }

                  if (!var3) {
                     break label142;
                  }
               }

               if (~var4 == -2) {
                  int var5 = arg1.method2855(-31007);
                  this.field612 = new int[var5];
                  int var6 = 0;
                  if (var3) {
                     this.field612[var6] = arg1.method2855(arg0 + -31004);
                     ++var6;
                  }

                  while(true) {
                     while(this.field612.length > var6) {
                        this.field612[var6] = arg1.method2855(arg0 + -31004);
                        ++var6;
                     }

                     if (!var3) {
                        if (!var3) {
                           continue label140;
                        }
                        break label140;
                     }

                     ++var6;
                  }
               }
               break;
            }

            if (~var4 != -4) {
               if (var4 != 4) {
                  if (~var4 != -6) {
                     if (~var4 != -7) {
                        continue;
                     }

                     this.field609 = new int[arg1.method2855(arg0 + -31004)];
                     int var7 = 0;
                     if (var3) {
                        this.field609[var7] = arg1.method2855(-31007);
                        ++var7;
                     }

                     while(true) {
                        while(this.field609.length > var7) {
                           this.field609[var7] = arg1.method2855(-31007);
                           ++var7;
                        }

                        if (!var3) {
                           if (!var3) {
                              continue label142;
                           }
                           break;
                        }

                        ++var7;
                     }
                  }

                  this.field611 = new int[arg1.method2855(-31007)];
                  int var8 = 0;
                  if (var3) {
                     this.field611[var8] = arg1.method2855(-31007);
                     ++var8;
                  }

                  while(true) {
                     while(~this.field611.length < ~var8) {
                        this.field611[var8] = arg1.method2855(-31007);
                        ++var8;
                     }

                     if (!var3) {
                        if (!var3) {
                           continue label142;
                        }
                        break;
                     }

                     ++var8;
                  }
               }

               this.field615 = arg1.method2855(arg0 + -31004);
               if (!var3) {
                  continue;
               }
            }

            this.field614 = arg1.method2855(arg0 ^ 31004);
            if (var3) {
               break;
            }
         }

         if (arg0 != -3) {
            method332(-58, -122, 9, -63);
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field621[1] + arg0 + ',' + (arg1 != null ? field621[0] : field621[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method334(int arg0) {
      try {
         field616 = null;
         field619 = null;
         if (arg0 != -2) {
            field618 = null;
         }

         field618 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field621[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method335(int arg0) {
      try {
         class400.method3232(-8001, ~class687.field10213.field526.method2323(480102311) == -2, 2, 22050);
         ++field610;
         class218.field3290 = class381.method3096(0, class544.field8183, class498.field7578, (byte)118, 22050);
         class407.method3266(0, class562.method4238((class80)null, 109), true);
         class321.field4914 = class381.method3096(1, class544.field8183, class498.field7578, (byte)118, 2048);
         class426.field6579 = new class647();
         class321.field4914.method5574((byte)34, class426.field6579);
         if (arg0 > -118) {
            field619 = null;
         }

         class80.field1107 = new class398(22050, class752.field11155);
         class147.method1348(6819);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field621[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "<init>",
      descriptor = "(Lrr;)V"
   )
   public class47(class678 arg0) {
      try {
         byte[] var2 = arg0.method5025(0, 6);
         this.method333(-3, new class354(var2));
         if (this.field612 == null) {
            throw new RuntimeException("");
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field621[3] + (arg0 != null ? field621[0] : field621[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "<init>",
      descriptor = "()V"
   )
   protected class47() {
      try {
         this.field612 = new int[0];
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field621[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method336(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ed",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method337(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
