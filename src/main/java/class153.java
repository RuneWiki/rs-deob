import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public abstract class class153 extends class22 {
   @OriginalMember(
      owner = "client!mr",
      name = "l",
      descriptor = "Ljagtheora/ogg/OggStreamState;"
   )
   public OggStreamState field2439;
   @OriginalMember(
      owner = "client!mr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2448 = new String[]{method1424(method1423("\u0000T&U")), method1424(method1423("\u0003SdrQ")), method1424(method1423("\u0015\u000fd\u0017\u0004")), method1424(method1423("\u0003SduQ")), method1424(method1423("\u0003Sd\u0005\u0010\u0000H>\u0007Q")), method1424(method1423("\u0003SdsQ"))};
   @OriginalMember(
      owner = "client!mr",
      name = "o",
      descriptor = "Ltv;"
   )
   public static class584 field2444 = new class584(1);
   @OriginalMember(
      owner = "client!mr",
      name = "k",
      descriptor = "F"
   )
   public static float field2446;
   @OriginalMember(
      owner = "client!mr",
      name = "q",
      descriptor = "I"
   )
   public static int field2440;
   @OriginalMember(
      owner = "client!mr",
      name = "p",
      descriptor = "I"
   )
   public static int field2441;
   @OriginalMember(
      owner = "client!mr",
      name = "j",
      descriptor = "I"
   )
   public static int field2442;
   @OriginalMember(
      owner = "client!mr",
      name = "m",
      descriptor = "I"
   )
   public int field2443;
   @OriginalMember(
      owner = "client!mr",
      name = "n",
      descriptor = "J"
   )
   public static long field2445;
   @OriginalMember(
      owner = "client!mr",
      name = "r",
      descriptor = "[Lde;"
   )
   public static class555[] field2447;

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(Ljagtheora/ogg/OggPacket;I)V"
   )
   public abstract void method1418(OggPacket arg0, int arg1);

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(B)V"
   )
   public abstract void method1419(byte arg0);

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1420(int arg0) {
      try {
         if (arg0 != -127) {
            method1420(23);
         }

         field2444 = null;
         field2447 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2448[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method1421(int arg0, int arg1, int arg2) {
      boolean var3 = client.field4564;

      try {
         if (arg2 != 19190) {
            field2444 = null;
         }

         ++field2440;
         if (arg0 == -2) {
            return 12345678;
         } else if (arg0 == -1) {
            if (arg1 < 2) {
               arg1 = 2;
               if (!var3) {
                  return arg1;
               }
            }

            if (~arg1 < -127) {
               arg1 = 126;
            }

            return arg1;
         } else {
            arg1 = (arg0 & 127) * arg1 >> 7;
            if (arg1 >= 2) {
               if (~arg1 >= -127) {
                  return (65408 & arg0) + arg1;
               }

               arg1 = 126;
               if (!var3) {
                  return (65408 & arg0) + arg1;
               }
            }

            arg1 = 2;
            return (65408 & arg0) + arg1;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2448[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "b",
      descriptor = "(Ljagtheora/ogg/OggPacket;I)V"
   )
   public final void method1422(OggPacket arg0, int arg1) {
      try {
         if (arg1 != -127) {
            this.field2443 = 108;
         }

         this.method1418(arg0, 110);
         ++field2441;
         ++this.field2443;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2448[1] + (arg0 != null ? field2448[2] : field2448[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class153(OggStreamState arg0) {
      try {
         this.field2439 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2448[4] + (arg0 != null ? field2448[2] : field2448[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1423(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1424(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 33;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
