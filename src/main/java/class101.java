import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class101 extends class698 implements class723 {
   @OriginalMember(
      owner = "client!kb",
      name = "i",
      descriptor = "I"
   )
   private int field1594;
   @OriginalMember(
      owner = "client!kb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1601 = new String[]{method1001(method1000("LN\fIT")), method1001(method1000("LN\fET")), method1001(method1000("LN\fCT")), method1001(method1000("LN\fFT")), method1001(method1000("LN\fBT")), method1001(method1000("LN\fGT")), method1001(method1000("IYNm")), method1001(method1000("\\\u0002\f/\u0001")), method1001(method1000("LN\fDT")), method1001(method1000("LN\f=\u0015IEV?T")), method1001(method1000("\u0007{Cm\u0010T\u0016\u0002")), method1001(method1000("hOAm\tCI\u0002B\u001dKO\u0002U\u0013HG\u0018!")), method1001(method1000("\u0007orrF\u0007")), method1001(method1000("hOAm\tCIPrF\u0007")), method1001(method1000("hOAm\tCIF;\\`^Mt\u0012C\u0016")), method1001(method1000("cUL`\u0011NO\u0018!")), method1001(method1000("R_")), method1001(method1000("sCV`\u0010\u0007xP`\u0012T\fmo\u000fD^Gd\u0012\u001d\f")), method1001(method1000("\u0007|Ky\u0019K_\u0018!")), method1001(method1000("sCV`\u0010\u0007cR`\rRI\u0002N\u0012TOPd\u0019I\u0016\u0002")), method1001(method1000("\u0007mAu\u0015QI\u0018!"))};
   @OriginalMember(
      owner = "client!kb",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field1593 = null;
   @OriginalMember(
      owner = "client!kb",
      name = "h",
      descriptor = "I"
   )
   public static int field1595;
   @OriginalMember(
      owner = "client!kb",
      name = "c",
      descriptor = "I"
   )
   public static int field1596;
   @OriginalMember(
      owner = "client!kb",
      name = "f",
      descriptor = "I"
   )
   public static int field1597;
   @OriginalMember(
      owner = "client!kb",
      name = "e",
      descriptor = "I"
   )
   public static int field1598;
   @OriginalMember(
      owner = "client!kb",
      name = "j",
      descriptor = "I"
   )
   public static int field1599;
   @OriginalMember(
      owner = "client!kb",
      name = "g",
      descriptor = "I"
   )
   public static int field1600;

   @OriginalMember(
      owner = "client!kb",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method992(int arg0) {
      try {
         if (arg0 != 16161) {
            return -19L;
         } else {
            ++field1596;
            return super.field10071.getAddress();
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1601[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method993(byte arg0) {
      try {
         ++field1597;
         if (arg0 != 116) {
            method998(90, 66);
         }

         return this.field1594;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1601[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "c",
      descriptor = "(I)Lju;"
   )
   public static final class270 method994(int arg0) {
      boolean var1 = client.field10022;

      try {
         ++field1595;
         if (class651.field9217 != null && class74.field1187 != null) {
            if (arg0 != -1) {
               method994(60);
            }

            class270 var2 = (class270)class74.field1187.method5301(0);
            if (!var1 && var2 == null) {
               return null;
            } else {
               do {
                  class541 var3 = class651.field9200.method1756(36, var2.field4134);
                  if (var3 != null && var3.field7633 && var3.method4032(class651.field9208, (byte)117)) {
                     return var2;
                  }

                  var2 = (class270)class74.field1187.method5301(0);
               } while(var2 != null);

               return null;
            }
         } else {
            return null;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1601[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "<init>",
      descriptor = "(Laea;I[BI)V"
   )
   public class101(class678 arg0, int arg1, byte[] arg2, int arg3) {
      super(arg0, arg2, arg3);

      try {
         this.field1594 = arg1;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1601[9] + (arg0 != null ? field1601[7] : field1601[6]) + ',' + arg1 + ',' + (arg2 != null ? field1601[7] : field1601[6]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method995(int arg0) {
      try {
         ++field1598;
         if (arg0 >= -8) {
            field1593 = null;
         }

         return 0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1601[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "a",
      descriptor = "(I[BII)V"
   )
   public final void method996(int arg0, byte[] arg1, int arg2, int arg3) {
      try {
         this.method5107(arg1, arg3);
         if (arg2 > -16) {
            method997();
         }

         ++field1600;
         this.field1594 = arg0;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1601[5] + arg0 + ',' + (arg1 != null ? field1601[7] : field1601[6]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "a",
      descriptor = "()V"
   )
   public static final void method997() {
      byte var0 = 10;
      byte var1 = 30;
      if (class33.field470 != 0 && class319.field4764 != null) {
         class720.field10315.method211(class435.field6376);

         for(int var2 = 0; var2 < class320.field4779.length; ++var2) {
            class720.field10315.method225(class364.field5373[var2] + class320.field4779[var2], -1732, class435.field6376[1], -256, class435.field6376[3] - class435.field6376[1]);
         }

         for(int var3 = 0; var3 < class499.field7108; ++var3) {
            class662 var11 = class774.field11262[var3];
            class720.field10315.method248(var11.field9323[0], var11.field9313[0], var11.field9310[0], class435.field6372);
            class720.field10315.method248(var11.field9323[1], var11.field9313[1], var11.field9310[1], class234.field3618);
            class720.field10315.method248(var11.field9323[2], var11.field9313[2], var11.field9310[2], class588.field8259);
            class720.field10315.method248(var11.field9323[3], var11.field9313[3], var11.field9310[3], class226.field3244);
            if (class435.field6372[2] != -1 && class234.field3618[2] != -1 && class588.field8259[2] != -1 && class226.field3244[2] != -1) {
               int var12 = -65536;
               if (var11.field9324 == 4) {
                  var12 = -16776961;
               }

               class720.field10315.method177(class435.field6372[1], class234.field3618[0], class435.field6372[0], var12, class234.field3618[1], (byte)31);
               class720.field10315.method177(class234.field3618[1], class588.field8259[0], class234.field3618[0], var12, class588.field8259[1], (byte)31);
               class720.field10315.method177(class588.field8259[1], class226.field3244[0], class588.field8259[0], var12, class226.field3244[1], (byte)31);
               class720.field10315.method177(class226.field3244[1], class435.field6372[0], class226.field3244[0], var12, class435.field6372[1], (byte)31);
               class720.field10315.method177(class435.field6372[1], class588.field8259[0], class435.field6372[0], var12, class588.field8259[1], (byte)31);
            }
         }

         class319.field4764.method1860(var0, false, var1 + 45, -16777216, -256, field1601[15] + class155.field2377 + "/" + 5000);
         class319.field4764.method1860(var0, false, var1 + 60, -16777216, -256, field1601[19] + class139.field2234 + "/" + 10000);
         class319.field4764.method1860(var0, false, var1 + 75, -16777216, -256, field1601[17] + class432.field6346 + "/" + 5000);
         class319.field4764.method1860(var0, false, var1 + 90, -16777216, -256, field1601[13] + (class517.field7317 + class29.field421) + field1601[20] + class499.field7108);
         class319.field4764.method1860(var0, false, var1 + 105, -16777216, -256, field1601[14] + class48.field729 + field1601[10] + class278.field4202 + field1601[12] + class40.field622 + field1601[18] + class526.field7443);
         class319.field4764.method1860(var0, false, var1 + 120, -16777216, -256, field1601[11] + class118.field1851 / 1000L + field1601[16]);
         if (class33.field470 == 2 && class595.field8383 != null) {
            for(int var4 = 0; var4 < class595.field8383.length; ++var4) {
               float var6 = (float)class595.field8383[var4];
               float var7 = var6 / 4194304.0F;
               if (var7 > 1.0F) {
                  var7 = 1.0F;
               }

               float var8 = var7 * 255.0F;
               float var9 = 255.0F - var8;
               int var10 = (int)var9;
               class595.field8383[var4] = var10 | var10 << 8 | var10 << 16 | -16777216;
            }

            class148 var5 = class720.field10315.method215(class597.field8402, class597.field8402, class595.field8383, class358.field5300, 0, 1);
            var5.method1352(var0, 170, 1, 0, 0);
         }
      }

   }

   @OriginalMember(
      owner = "client!kb",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method998(int arg0, int arg1) {
      try {
         ++field1599;
         return arg0 != -31020 ? 53 : (arg1 & 261966) >> 11;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1601[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method999(int arg0) {
      try {
         field1593 = null;
         if (arg0 != 2) {
            method994(-87);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1601[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1000(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1001(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
