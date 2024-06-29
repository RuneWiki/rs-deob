import jaggl.OpenGL;
import java.awt.Canvas;
import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qja")
public class class137 extends class25 {
   @OriginalMember(
      owner = "client!qja",
      name = "G",
      descriptor = "B"
   )
   public byte field2210 = 5;
   @OriginalMember(
      owner = "client!qja",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2211 = new String[]{method1391(method1390("\u001bt\u001c{^B")), method1391(method1390("\u001bt\u001c{XB")), method1391(method1390("\u0000\u007f\u001a2q")), method1391(method1390("\u001bt\u001c{\\B")), method1391(method1390("\u00110S{`")), method1391(method1390("\u0004k\u00119")), method1391(method1390("\u001bt\u001c{_B")), method1391(method1390("\u001bt\u001c{YB")), method1391(method1390("P>"))};
   @OriginalMember(
      owner = "client!qja",
      name = "D",
      descriptor = "I"
   )
   public int field2198;
   @OriginalMember(
      owner = "client!qja",
      name = "y",
      descriptor = "I"
   )
   public int field2199;
   @OriginalMember(
      owner = "client!qja",
      name = "B",
      descriptor = "I"
   )
   public static int field2200;
   @OriginalMember(
      owner = "client!qja",
      name = "v",
      descriptor = "I"
   )
   public int field2201;
   @OriginalMember(
      owner = "client!qja",
      name = "C",
      descriptor = "I"
   )
   public static int field2203;
   @OriginalMember(
      owner = "client!qja",
      name = "F",
      descriptor = "I"
   )
   public int field2204;
   @OriginalMember(
      owner = "client!qja",
      name = "z",
      descriptor = "I"
   )
   public static int field2205;
   @OriginalMember(
      owner = "client!qja",
      name = "w",
      descriptor = "I"
   )
   public int field2207;
   @OriginalMember(
      owner = "client!qja",
      name = "E",
      descriptor = "I"
   )
   public static int field2208;
   @OriginalMember(
      owner = "client!qja",
      name = "x",
      descriptor = "I"
   )
   public int field2209;
   @OriginalMember(
      owner = "client!qja",
      name = "H",
      descriptor = "Leu;"
   )
   public static class634 field2206;
   @OriginalMember(
      owner = "client!qja",
      name = "A",
      descriptor = "Z"
   )
   public boolean field2202;

   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method1385(int arg0, int arg1) {
      try {
         ++field2205;
         if (arg0 != 4175) {
            field2206 = null;
         }

         return arg1 == 1 || arg1 == 3 || arg1 == 5;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2211[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "([Ljga;II)V"
   )
   public static final void method1386(class91[] param0, int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qja",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1387(int arg0) {
      try {
         field2206 = null;
         if (arg0 != 10) {
            field2206 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2211[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "(Lsa;ILjava/awt/Canvas;Ld;B)Lha;"
   )
   public static final class17 method1388(class39 arg0, int arg1, Canvas arg2, class672 arg3, byte arg4) {
      try {
         ++field2203;
         if (!class619.method4562((byte)15)) {
            throw new RuntimeException("");
         } else if (!class354.method2785(field2211[2], -105)) {
            throw new RuntimeException("");
         } else {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg2, 8, 8, 8, 24, 0, arg1);
            if (~var6 == -1L) {
               throw new RuntimeException("");
            } else {
               int var8 = -56 % ((24 - arg4) / 50);
               class771 var9 = new class771(var5, arg2, var6, arg3, arg0, arg1);
               var9.method1989(0);
               return var9;
            }
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field2211[3] + (arg0 != null ? field2211[4] : field2211[5]) + ',' + arg1 + ',' + (arg2 != null ? field2211[4] : field2211[5]) + ',' + (arg3 != null ? field2211[4] : field2211[5]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "(ILjava/lang/String;)V"
   )
   public static final void method1389(int arg0, String arg1) {
      boolean var2 = client.field10022;

      try {
         if (class359.field5307 == null) {
            class588.method4317(false);
         }

         if (arg0 >= -93) {
            field2206 = null;
         }

         ++field2208;
         class443.field6475.setTime(new Date(class604.method4452(-106)));
         int var3 = class443.field6475.get(11);
         int var4 = class443.field6475.get(12);
         int var5 = class443.field6475.get(13);
         String var6 = Integer.toString(var3 / 10) + var3 % 10 + ":" + var4 / 10 + var4 % 10 + ":" + var5 / 10 + var5 % 10;
         String[] var7 = class757.method5467(5, arg1, '\n');
         int var8 = 0;
         if (var2 || var8 < var7.length) {
            do {
               int var9 = class383.field5590;
               if (var2) {
                  class359.field5307[var9] = class359.field5307[var9 + -1];
                  --var9;
               }

               while(true) {
                  while(~var9 < -1) {
                     class359.field5307[var9] = class359.field5307[var9 + -1];
                     --var9;
                  }

                  class359.field5307[0] = var6 + field2211[8] + var7[var8];
                  if (!var2) {
                     if (class131.field2129 != null) {
                        try {
                           class131.field2129.write(class522.method3895(class359.field5307[0] + "\n", 0));
                        } catch (IOException var11) {
                        }
                     }

                     if (class359.field5307.length - 1 > class383.field5590) {
                        ++class383.field5590;
                        if (~class362.field5351 < -1) {
                           ++class362.field5351;
                        }
                     }

                     ++var8;
                     break;
                  }

                  --var9;
               }
            } while(var8 < var7.length);

         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field2211[7] + arg0 + ',' + (arg1 != null ? field2211[4] : field2211[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1390(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 29);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1391(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 29;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
