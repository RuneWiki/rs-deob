import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class115 {
   @OriginalMember(
      owner = "client!kba",
      name = "e",
      descriptor = "Z"
   )
   public boolean field1431 = true;
   @OriginalMember(
      owner = "client!kba",
      name = "l",
      descriptor = "I"
   )
   private int field1438 = 0;
   @OriginalMember(
      owner = "client!kba",
      name = "i",
      descriptor = "Z"
   )
   public boolean field1435 = true;
   @OriginalMember(
      owner = "client!kba",
      name = "c",
      descriptor = "I"
   )
   public int field1434 = -1;
   @OriginalMember(
      owner = "client!kba",
      name = "k",
      descriptor = "I"
   )
   public int field1426 = 512;
   @OriginalMember(
      owner = "client!kba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1440 = new String[]{method931(method930(")7.O3j")), method931(method930(")7.O2j")), method931(method930(")7.O1j")), method931(method930(", #\r")), method931(method930("9{aO\r")), method931(method930(")7.O4j"))};
   @OriginalMember(
      owner = "client!kba",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field1427 = new int[2];
   @OriginalMember(
      owner = "client!kba",
      name = "j",
      descriptor = "I"
   )
   public int field1428;
   @OriginalMember(
      owner = "client!kba",
      name = "n",
      descriptor = "I"
   )
   public int field1429;
   @OriginalMember(
      owner = "client!kba",
      name = "g",
      descriptor = "I"
   )
   public static int field1430;
   @OriginalMember(
      owner = "client!kba",
      name = "b",
      descriptor = "I"
   )
   public int field1432;
   @OriginalMember(
      owner = "client!kba",
      name = "m",
      descriptor = "I"
   )
   public static int field1433;
   @OriginalMember(
      owner = "client!kba",
      name = "f",
      descriptor = "I"
   )
   public static int field1436;
   @OriginalMember(
      owner = "client!kba",
      name = "d",
      descriptor = "I"
   )
   public static int field1437;
   @OriginalMember(
      owner = "client!kba",
      name = "a",
      descriptor = "I"
   )
   public int field1439;

   @OriginalMember(
      owner = "client!kba",
      name = "a",
      descriptor = "(ILwf;I)V",
      line = 10
   )
   private final void method926(int arg0, class147 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         label57: {
            if (arg0 != 1) {
               if (arg0 != 2) {
                  if (arg0 == 3) {
                     this.field1426 = arg1.method1211(-26166) << 2;
                     if (!var4) {
                        break label57;
                     }
                  }

                  if (arg0 == 4) {
                     this.field1431 = false;
                     if (!var4) {
                        break label57;
                     }
                  }

                  if (arg0 != 5) {
                     break label57;
                  }

                  this.field1435 = false;
                  if (!var4) {
                     break label57;
                  }
               }

               this.field1434 = arg1.method1211(-26166);
               if (this.field1434 != 65535) {
                  break label57;
               }

               this.field1434 = -1;
               if (!var4) {
                  break label57;
               }
            }

            this.field1438 = arg1.method1166((byte)-48);
            this.method929(this.field1438, 5646);
         }

         ++field1437;
         if (arg2 > -108) {
            this.field1435 = false;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1440[2] + arg0 + ',' + (arg1 != null ? field1440[4] : field1440[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "a",
      descriptor = "(Z)V",
      line = 54
   )
   public static void method927(boolean arg0) {
      try {
         if (arg0) {
            field1427 = null;
         }

         field1427 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1440[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "a",
      descriptor = "(Lwf;I)V",
      line = 64
   )
   public final void method928(class147 arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field1436;

         while(true) {
            int var4 = arg0.method1143(-15465);
            if (~var4 != -1) {
               this.method926(var4, arg0, -110);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg1 != -9776) {
               field1427 = null;
               return;
            }
            break;
         }

      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1440[5] + (arg0 != null ? field1440[4] : field1440[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "a",
      descriptor = "(II)V",
      line = 97
   )
   private final void method929(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field1430;
         double var4 = (double)((16715553 & arg0) >> 16) / 256.0D;
         double var6 = (double)((65450 & arg0) >> 8) / 256.0D;
         double var8 = (double)(arg0 & 255) / 256.0D;
         double var10 = var4;
         if (var4 > var6) {
            var10 = var6;
         }

         if (var10 > var8) {
            var10 = var8;
         }

         double var12 = var4;
         if (var6 > var4) {
            var12 = var6;
         }

         if (var8 > var12) {
            var12 = var8;
         }

         if (arg1 != 5646) {
            this.field1426 = -43;
         }

         double var14 = 0.0D;
         double var16 = 0.0D;
         double var18 = (var10 + var12) / 2.0D;
         if (var10 != var12) {
            if (var18 < 0.5D) {
               var16 = (-var10 + var12) / (var10 + var12);
            }

            label86: {
               if (var4 != var12) {
                  if (var6 != var12) {
                     if (var8 != var12) {
                        break label86;
                     }

                     var14 = (var4 - var6) / (-var10 + var12) + 4.0D;
                     if (!var3) {
                        break label86;
                     }
                  }

                  var14 = (var8 - var4) / (-var10 + var12) + 2.0D;
                  if (!var3) {
                     break label86;
                  }
               }

               var14 = (var6 - var8) / (var12 - var10);
            }

            if (var18 >= 0.5D) {
               var16 = (-var10 + var12) / (2.0D - var12 - var10);
            }
         }

         double var20;
         label76: {
            var20 = var14 / 6.0D;
            this.field1439 = (int)(var16 * 256.0D);
            this.field1429 = (int)(var18 * 256.0D);
            if (~this.field1429 <= -1) {
               if (this.field1429 <= 255) {
                  break label76;
               }

               this.field1429 = 255;
               if (!var3) {
                  break label76;
               }
            }

            this.field1429 = 0;
         }

         label69: {
            if (this.field1439 >= 0) {
               if (~this.field1439 >= -256) {
                  break label69;
               }

               this.field1439 = 255;
               if (!var3) {
                  break label69;
               }
            }

            this.field1439 = 0;
         }

         label62: {
            if (var18 > 0.5D) {
               this.field1432 = (int)((-var18 + 1.0D) * var16 * 512.0D);
               if (!var3) {
                  break label62;
               }
            }

            this.field1432 = (int)(var16 * var18 * 512.0D);
         }

         if (~this.field1432 > -2) {
            this.field1432 = 1;
         }

         this.field1428 = (int)((double)this.field1432 * var20);
      } catch (RuntimeException var23) {
         throw class237.method1823(var23, field1440[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method930(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method931(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 66;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
