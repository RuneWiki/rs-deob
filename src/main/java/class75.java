import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class75 extends class47 {
   @OriginalMember(
      owner = "client!jb",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1209 = new String[]{method838(method837("!l}e\u0016")), method838(method837("47?'")), method838(method837("0 }\u0006C")), method838(method837("0 }\tC")), method838(method837("0 }\u000fC")), method838(method837("\t\u0017\u0011")), method838(method837("0 }\bC")), method838(method837("0 }\fC")), method838(method837("0 }\rC")), method838(method837("0 }\u0003C")), method838(method837("0 }\u000eC")), method838(method837("0 }\u0002C")), method838(method837("0 }\nC"))};
   @OriginalMember(
      owner = "client!jb",
      name = "D",
      descriptor = "[I"
   )
   public static int[] field1194 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
   @OriginalMember(
      owner = "client!jb",
      name = "x",
      descriptor = "F"
   )
   private float field1192;
   @OriginalMember(
      owner = "client!jb",
      name = "A",
      descriptor = "F"
   )
   private float field1196;
   @OriginalMember(
      owner = "client!jb",
      name = "B",
      descriptor = "I"
   )
   public static int field1193;
   @OriginalMember(
      owner = "client!jb",
      name = "q",
      descriptor = "I"
   )
   public static int field1197;
   @OriginalMember(
      owner = "client!jb",
      name = "r",
      descriptor = "I"
   )
   public static int field1198;
   @OriginalMember(
      owner = "client!jb",
      name = "t",
      descriptor = "I"
   )
   private int field1199;
   @OriginalMember(
      owner = "client!jb",
      name = "p",
      descriptor = "I"
   )
   public static int field1200;
   @OriginalMember(
      owner = "client!jb",
      name = "w",
      descriptor = "I"
   )
   public static int field1201;
   @OriginalMember(
      owner = "client!jb",
      name = "E",
      descriptor = "I"
   )
   public static int field1202;
   @OriginalMember(
      owner = "client!jb",
      name = "v",
      descriptor = "I"
   )
   public static int field1203;
   @OriginalMember(
      owner = "client!jb",
      name = "z",
      descriptor = "I"
   )
   private int field1204;
   @OriginalMember(
      owner = "client!jb",
      name = "y",
      descriptor = "I"
   )
   public static int field1205;
   @OriginalMember(
      owner = "client!jb",
      name = "u",
      descriptor = "I"
   )
   public static int field1207;
   @OriginalMember(
      owner = "client!jb",
      name = "C",
      descriptor = "I"
   )
   public static int field1208;
   @OriginalMember(
      owner = "client!jb",
      name = "F",
      descriptor = "Ljava/lang/String;"
   )
   private String field1191;
   @OriginalMember(
      owner = "client!jb",
      name = "s",
      descriptor = "Ljava/lang/String;"
   )
   private String field1195;
   @OriginalMember(
      owner = "client!jb",
      name = "o",
      descriptor = "Ljava/lang/String;"
   )
   private String field1206;

   @OriginalMember(
      owner = "client!jb",
      name = "b",
      descriptor = "(B)Ljava/lang/String;"
   )
   public final String method829(byte arg0) {
      try {
         if (arg0 != 35) {
            return null;
         } else {
            ++field1205;
            return this.field1206;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1209[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "(Lfn;ZLfn;)V"
   )
   public static final void method830(class96 arg0, boolean arg1, class96 arg2) {
      try {
         if (arg2.field1547 != null) {
            arg2.method962(false);
         }

         ++field1203;
         arg2.field1547 = arg0.field1547;
         if (arg1) {
            method832(-122);
         }

         arg2.field1553 = arg0;
         arg2.field1547.field1553 = arg2;
         arg2.field1553.field1547 = arg2;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1209[11] + (arg0 != null ? field1209[0] : field1209[1]) + ',' + arg1 + ',' + (arg2 != null ? field1209[0] : field1209[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "e",
      descriptor = "(I)Ljava/lang/String;"
   )
   public final String method831(int arg0) {
      try {
         ++field1200;
         int var2 = 25 / ((arg0 - 44) / 53);
         return this.field1191;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1209[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method832(int arg0) {
      try {
         field1194 = null;
         if (arg0 >= -49) {
            method833(102, 41, -116, (byte[])null);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1209[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "(ILjagtheora/ogg/OggPacket;)V"
   )
   public final void method468(int arg0, OggPacket arg1) {
      try {
         ++field1208;
         if (~super.field727 >= -1 || field1209[5].equals(this.field1195)) {
            if (arg0 != -13313) {
               method833(2, -74, 27, (byte[])null);
            }

            class65 var3 = new class65(arg1.getData());
            int var4 = var3.method665(false);
            if (super.field727 <= 8) {
               if (~(var4 | 128) == -1) {
                  throw new IllegalStateException();
               }

               if (~super.field727 == -1) {
                  var3.field945 += 23;
                  this.field1199 = var3.method704(false);
                  this.field1204 = var3.method704(false);
                  if (this.field1199 != 0 && ~this.field1204 != -1) {
                     class65 var5 = new class65(16);
                     var3.method678(16, -32768, 0, var5.field942);
                     this.field1206 = var5.method640((byte)51);
                     var5.field945 = 0;
                     var3.method678(16, -32768, 0, var5.field942);
                     this.field1195 = var5.method640((byte)51);
                     return;
                  }

                  throw new IllegalStateException();
               }
            } else {
               if (~var4 == -1) {
                  long var6 = var3.method702((byte)-30);
                  long var8 = var3.method702((byte)-30);
                  long var10 = var3.method702((byte)-30);
                  if (~var6 > -1L || ~var8 > -1L || var10 < 0L || ~var10 < ~var6) {
                     throw new IllegalStateException();
                  }

                  this.field1196 = (float)((var6 + var8) * (long)this.field1204) / (float)this.field1199;
                  this.field1192 = (float)((long)this.field1204 * var6) / (float)this.field1199;
                  int var12 = var3.method704(false);
                  if (~var12 > -1 || ~(var3.field942.length + -var3.field945) > ~var12) {
                     throw new IllegalStateException();
                  }

                  this.field1191 = class266.method2277(126, var3.field942, var3.field945, var12);
               }

               if (~(var4 | 128) != -1) {
                  return;
               }
            }

         }
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field1209[4] + arg0 + ',' + (arg1 != null ? field1209[0] : field1209[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "(III[B)[B"
   )
   public static final byte[] method833(int arg0, int arg1, int arg2, byte[] arg3) {
      try {
         ++field1197;
         byte[] var4 = new byte[arg0];
         class474.method3640(arg3, arg2, var4, arg1, arg0);
         return var4;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1209[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1209[0] : field1209[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "c",
      descriptor = "(B)F"
   )
   public final float method834(byte arg0) {
      try {
         ++field1202;
         if (arg0 < 97) {
            field1194 = null;
         }

         return this.field1192;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1209[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class75(OggStreamState arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method471(int arg0) {
      try {
         if (arg0 != -1) {
            field1194 = null;
         }

         ++field1207;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1209[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "f",
      descriptor = "(I)F"
   )
   public final float method835(int arg0) {
      try {
         if (arg0 != 19) {
            return 1.2454914F;
         } else {
            ++field1193;
            return this.field1196;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1209[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "(BLjava/lang/String;Ljava/lang/String;)V"
   )
   public static final void method836(byte arg0, String arg1, String arg2) {
      try {
         ++field1198;
         if (arg2.length() <= 320) {
            if (class613.method4509(107)) {
               class745.field10604.method2114(0);
               int var3 = -123 % ((arg0 - -86) / 39);
               class261.method2247(-108);
               class226.field3216 = arg2;
               class492.field7022 = arg1;
               class755.method5457(5, false);
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1209[8] + arg0 + ',' + (arg1 != null ? field1209[0] : field1209[1]) + ',' + (arg2 != null ? field1209[0] : field1209[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method837(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method838(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 66;
            break;
         case 2:
            var10005 = 83;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
