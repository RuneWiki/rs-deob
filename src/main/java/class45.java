import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class45 {
   @OriginalMember(
      owner = "client!os",
      name = "d",
      descriptor = "I"
   )
   public int field591 = 512;
   @OriginalMember(
      owner = "client!os",
      name = "l",
      descriptor = "I"
   )
   private int field595 = 0;
   @OriginalMember(
      owner = "client!os",
      name = "c",
      descriptor = "I"
   )
   public int field594 = -1;
   @OriginalMember(
      owner = "client!os",
      name = "b",
      descriptor = "Z"
   )
   public boolean field602 = true;
   @OriginalMember(
      owner = "client!os",
      name = "f",
      descriptor = "Z"
   )
   public boolean field606 = true;
   @OriginalMember(
      owner = "client!os",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field607 = new String[]{method331(method330("!\\%N1")), method331(method330("5\u0001%!d")), method331(method330(" Zgc")), method331(method330("!\\%K1")), method331(method330("*@hzt+A\u007f!z!@`f|s\r")), method331(method330("=J\u007f{p Hx2")), method331(method330("-@ddp+Gd|m")), method331(method330("u\u000fNwi']n|$")), method331(method330("!\\%L1")), method331(method330("-@ddp+_yj\u007f'W")), method331(method330("u\u000fFnacnlj$")), method331(method330("u\u000f}jk=Fda$\u007f\u0014+\u007fx:G6 \"nKdbx'A6")), method331(method330("u\u000fNwi']n|$\u001aG~#9~\u001e&Ex \u0002:6.~\u000f;?#~\u001f1?)nhF[\"nbjw4\u000fHn2)")), method331(method330("!\\%J1")), method331(method330("!\\%I1")), method331(method330("!\\%M1"))};
   @OriginalMember(
      owner = "client!os",
      name = "j",
      descriptor = "I"
   )
   public static int field592;
   @OriginalMember(
      owner = "client!os",
      name = "g",
      descriptor = "I"
   )
   public int field593;
   @OriginalMember(
      owner = "client!os",
      name = "n",
      descriptor = "I"
   )
   public int field596;
   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "I"
   )
   public static int field597;
   @OriginalMember(
      owner = "client!os",
      name = "p",
      descriptor = "I"
   )
   public static int field598;
   @OriginalMember(
      owner = "client!os",
      name = "o",
      descriptor = "I"
   )
   public static int field600;
   @OriginalMember(
      owner = "client!os",
      name = "h",
      descriptor = "I"
   )
   public static int field601;
   @OriginalMember(
      owner = "client!os",
      name = "k",
      descriptor = "I"
   )
   public static int field603;
   @OriginalMember(
      owner = "client!os",
      name = "e",
      descriptor = "I"
   )
   public int field604;
   @OriginalMember(
      owner = "client!os",
      name = "i",
      descriptor = "I"
   )
   public int field605;
   @OriginalMember(
      owner = "client!os",
      name = "m",
      descriptor = "Ll;"
   )
   public static class98 field599;

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(Lica;IZ)V"
   )
   private final void method324(class354 arg0, int arg1, boolean arg2) {
      boolean var4 = client.field1786;

      try {
         if (arg2) {
            this.method329((class354)null, (byte)-83);
         }

         label64: {
            if (~arg1 == -2) {
               this.field595 = arg0.method2872(2);
               this.method328(-1, this.field595);
               if (!var4) {
                  break label64;
               }
            }

            if (arg1 == 2) {
               this.field594 = arg0.method2848(-112);
               if (~this.field594 != -65536) {
                  break label64;
               }

               this.field594 = -1;
               if (!var4) {
                  break label64;
               }
            }

            if (~arg1 != -4) {
               if (~arg1 != -5) {
                  if (~arg1 != -6) {
                     break label64;
                  }

                  this.field606 = false;
                  if (!var4) {
                     break label64;
                  }
               }

               this.field602 = false;
               if (!var4) {
                  break label64;
               }
            }

            this.field591 = arg0.method2848(-126) << 2;
         }

         ++field597;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field607[15] + (arg0 != null ? field607[1] : field607[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(Ljava/lang/String;Z)V"
   )
   public static final void method325(String arg0, boolean arg1) {
      try {
         ++field592;
         class518.field7891 = arg0;
         if (class684.field10176 != null) {
            try {
               String var2 = class684.field10176.getParameter(field607[9]);
               if (arg1) {
                  String var4;
                  label34: {
                     String var3 = class684.field10176.getParameter(field607[6]);
                     var4 = var2 + field607[5] + arg0 + field607[11] + var3;
                     if (~arg0.length() == -1) {
                        var4 = var4 + field607[12];
                        if (!client.field1786) {
                           break label34;
                        }
                     }

                     var4 = var4 + field607[7] + class83.method809(class162.method1442(14080) + 94608000000L, (byte)121) + field607[10] + 94608000L;
                  }

                  class676.method4987(!arg1, class684.field10176, field607[4] + var4 + "\"");
               }
            } catch (Throwable var6) {
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field607[8] + (arg0 != null ? field607[1] : field607[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(IZ[BI)Ljava/lang/String;"
   )
   public static final String method326(int arg0, boolean arg1, byte[] arg2, int arg3) {
      try {
         ++field598;
         if (!arg1) {
            method327(105);
         }

         char[] var4 = new char[arg0];
         int var5 = 0;

         for(int var6 = 0; arg0 > var6; ++var6) {
            int var7 = 255 & arg2[arg3 - -var6];
            if (~var7 != -1) {
               if (var7 >= 128 && var7 < 160) {
                  char var8 = class653.field9779[var7 + -128];
                  if (var8 == 0) {
                     var8 = '?';
                  }

                  var7 = var8;
               }

               var4[var5++] = (char)var7;
            }
         }

         return new String(var4, 0, var5);
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field607[13] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field607[1] : field607[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method327(int arg0) {
      try {
         field599 = null;
         if (arg0 != -17930) {
            method327(99);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field607[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(II)V"
   )
   private final void method328(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field601;
         double var4 = (double)(255 & arg1 >> 16) / 256.0D;
         double var6 = (double)(255 & arg1 >> 8) / 256.0D;
         double var8 = (double)(255 & arg1) / 256.0D;
         double var10 = var4;
         if (var6 < var4) {
            var10 = var6;
         }

         if (var10 > var8) {
            var10 = var8;
         }

         double var12 = var4;
         if (var6 > var4) {
            var12 = var6;
         }

         if (var12 < var8) {
            var12 = var8;
         }

         double var14 = 0.0D;
         double var16 = 0.0D;
         double var18 = (var10 + var12) / 2.0D;
         if (var10 != var12) {
            if (var18 < 0.5D) {
               var16 = (var12 - var10) / (var10 + var12);
            }

            label98: {
               if (var4 == var12) {
                  var14 = (var6 - var8) / (var12 - var10);
                  if (!var3) {
                     break label98;
                  }
               }

               if (var6 != var12) {
                  if (var8 != var12) {
                     break label98;
                  }

                  var14 = (var4 - var6) / (-var10 + var12) + 4.0D;
                  if (!var3) {
                     break label98;
                  }
               }

               var14 = (-var4 + var8) / (var12 - var10) + 2.0D;
            }

            if (var18 >= 0.5D) {
               var16 = (-var10 + var12) / (2.0D - var12 - var10);
            }
         }

         double var20;
         label73: {
            this.field593 = (int)(var16 * 256.0D);
            var20 = var14 / 6.0D;
            this.field596 = (int)(var18 * 256.0D);
            if (~this.field593 <= -1) {
               if (~this.field593 >= -256) {
                  break label73;
               }

               this.field593 = 255;
               if (!var3) {
                  break label73;
               }
            }

            this.field593 = 0;
         }

         label66: {
            if (~this.field596 <= arg0) {
               if (this.field596 <= 255) {
                  break label66;
               }

               this.field596 = 255;
               if (!var3) {
                  break label66;
               }
            }

            this.field596 = 0;
         }

         label59: {
            if (var18 > 0.5D) {
               this.field604 = (int)((1.0D - var18) * var16 * 512.0D);
               if (!var3) {
                  break label59;
               }
            }

            this.field604 = (int)(var16 * var18 * 512.0D);
         }

         if (~this.field604 > -2) {
            this.field604 = 1;
         }

         this.field605 = (int)((double)this.field604 * var20);
      } catch (RuntimeException var23) {
         throw class482.method3757(var23, field607[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(Lica;B)V"
   )
   public final void method329(class354 arg0, byte arg1) {
      boolean var3 = client.field1786;

      try {
         if (arg1 != 97) {
            method327(-15);
         }

         while(true) {
            int var4 = arg0.method2855(-31007);
            if (~var4 != -1) {
               this.method324(arg0, var4, false);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field600;
            break;
         }

      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field607[3] + (arg0 != null ? field607[1] : field607[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method330(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!os",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method331(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
