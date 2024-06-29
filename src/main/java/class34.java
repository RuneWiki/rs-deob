import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class34 {
   @OriginalMember(
      owner = "client!rf",
      name = "r",
      descriptor = "I"
   )
   public int field506 = 0;
   @OriginalMember(
      owner = "client!rf",
      name = "h",
      descriptor = "I"
   )
   public int field502 = 0;
   @OriginalMember(
      owner = "client!rf",
      name = "o",
      descriptor = "Z"
   )
   private boolean field496 = false;
   @OriginalMember(
      owner = "client!rf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field516 = new String[]{method394(method393("\"\\\u001e{")), method394(method393("7\u0007\\9W")), method394(method393(">O\\S\u0002")), method394(method393(">O\\U\u0002")), method394(method393(">O\\R\u0002")), method394(method393(">O\\T\u0002")), method394(method393(">O\\V\u0002")), method394(method393(">O\\Q\u0002"))};
   @OriginalMember(
      owner = "client!rf",
      name = "q",
      descriptor = "Lbu;"
   )
   public static class234 field494 = new class234(1, 2, 2, 0);
   @OriginalMember(
      owner = "client!rf",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field514 = false;
   @OriginalMember(
      owner = "client!rf",
      name = "c",
      descriptor = "I"
   )
   public static int field515 = 0;
   @OriginalMember(
      owner = "client!rf",
      name = "t",
      descriptor = "I"
   )
   public int field495;
   @OriginalMember(
      owner = "client!rf",
      name = "l",
      descriptor = "I"
   )
   public int field498;
   @OriginalMember(
      owner = "client!rf",
      name = "d",
      descriptor = "I"
   )
   public int field499;
   @OriginalMember(
      owner = "client!rf",
      name = "g",
      descriptor = "I"
   )
   public int field500;
   @OriginalMember(
      owner = "client!rf",
      name = "u",
      descriptor = "I"
   )
   public int field501;
   @OriginalMember(
      owner = "client!rf",
      name = "n",
      descriptor = "I"
   )
   public static int field503;
   @OriginalMember(
      owner = "client!rf",
      name = "a",
      descriptor = "I"
   )
   public static int field504;
   @OriginalMember(
      owner = "client!rf",
      name = "m",
      descriptor = "I"
   )
   public int field505;
   @OriginalMember(
      owner = "client!rf",
      name = "e",
      descriptor = "I"
   )
   public int field507;
   @OriginalMember(
      owner = "client!rf",
      name = "s",
      descriptor = "I"
   )
   private int field508;
   @OriginalMember(
      owner = "client!rf",
      name = "f",
      descriptor = "I"
   )
   public static int field509;
   @OriginalMember(
      owner = "client!rf",
      name = "p",
      descriptor = "I"
   )
   public static int field510;
   @OriginalMember(
      owner = "client!rf",
      name = "k",
      descriptor = "I"
   )
   public int field511;
   @OriginalMember(
      owner = "client!rf",
      name = "v",
      descriptor = "I"
   )
   public static int field512;
   @OriginalMember(
      owner = "client!rf",
      name = "i",
      descriptor = "I"
   )
   public int field513;
   @OriginalMember(
      owner = "client!rf",
      name = "j",
      descriptor = "J"
   )
   public long field497;

   @OriginalMember(
      owner = "client!rf",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method387(int arg0, int arg1) {
      try {
         class778.field11344 = null;
         class681.field9845 = -1;
         ++field509;
         class705.field10146 = false;
         class790.field11504 = -1;
         class438.field6424 = 0;
         class487.field6949 = arg0;
         class563.field8019 = null;
         class10.field165 = arg1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field516[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rf",
      name = "a",
      descriptor = "(ZLcu;)V"
   )
   public final void method388(boolean arg0, class65 arg1) {
      boolean var3 = client.field10022;

      try {
         ++field504;

         while(true) {
            int var4 = arg1.method665(arg0);
            if (~var4 != -1) {
               this.method390(arg1, var4, (byte)-95);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg0) {
               this.field497 = -74L;
               return;
            }
            break;
         }

      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field516[2] + arg0 + ',' + (arg1 != null ? field516[1] : field516[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rf",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method389(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 != 66) {
            field514 = true;
         }

         ++field510;
         return (arg2 & 2048) != 0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field516[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rf",
      name = "a",
      descriptor = "(Lcu;IB)V"
   )
   private final void method390(class65 arg0, int arg1, byte arg2) {
      boolean var4 = client.field10022;

      try {
         label70: {
            if (~arg1 != -2) {
               if (arg1 == 2) {
                  arg0.method665(false);
                  if (!var4) {
                     break label70;
                  }
               }

               if (arg1 != 3) {
                  if (~arg1 == -5) {
                     this.field498 = arg0.method665(false);
                     this.field495 = arg0.method701(255);
                     if (!var4) {
                        break label70;
                     }
                  }

                  if (~arg1 != -7) {
                     if (~arg1 != -9) {
                        if (arg1 != 9) {
                           if (arg1 != 10) {
                              break label70;
                           }

                           this.field496 = true;
                           if (!var4) {
                              break label70;
                           }
                        }

                        this.field506 = 1;
                        if (!var4) {
                           break label70;
                        }
                     }

                     this.field502 = 1;
                     if (!var4) {
                        break label70;
                     }
                  }

                  this.field507 = arg0.method665(false);
                  if (!var4) {
                     break label70;
                  }
               }

               this.field499 = arg0.method701(255);
               this.field500 = arg0.method701(255);
               this.field501 = arg0.method701(255);
               if (!var4) {
                  break label70;
               }
            }

            this.field508 = arg0.method685(-2);
         }

         int var5 = -117 / ((arg2 - 6) / 51);
         ++field503;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field516[7] + (arg0 != null ? field516[1] : field516[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rf",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method391(byte arg0) {
      boolean var2 = client.field10022;

      try {
         ++field512;
         this.field513 = class160.field2446[this.field508 << 3];
         if (arg0 < 19) {
            this.field498 = -28;
         }

         long var3 = (long)this.field499;
         long var5 = (long)this.field500;
         long var7 = (long)this.field501;
         this.field505 = (int)Math.sqrt((double)(var3 * var3 + (var5 * var5 - -(var7 * var7))));
         if (this.field495 == 0) {
            this.field495 = 1;
         }

         label46: {
            if (this.field498 == 0) {
               this.field497 = 2147483647L;
               if (!var2) {
                  break label46;
               }
            }

            if (this.field498 != 1) {
               if (this.field498 != 2) {
                  break label46;
               }

               this.field497 = (long)(this.field505 * 8 / this.field495);
               if (!var2) {
                  break label46;
               }
            }

            this.field497 = (long)(this.field505 * 8 / this.field495);
            this.field497 *= this.field497;
         }

         if (this.field496) {
            this.field505 *= -1;
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field516[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rf",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method392(int arg0) {
      try {
         field494 = null;
         if (arg0 >= -51) {
            method389(111, (byte)-101, 104);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field516[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method393(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method394(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 114;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
