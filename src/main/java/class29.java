import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public abstract class class29 extends class500 {
   @OriginalMember(
      owner = "client!qaa",
      name = "o",
      descriptor = "Ljagtheora/ogg/OggStreamState;"
   )
   public OggStreamState field359;
   @OriginalMember(
      owner = "client!qaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field361 = new String[]{method244(method243("I\u000e\u0002>8")), method244(method243("CAM>y[NEd{\u001a")), method244(method243("\\U@|")), method244(method243("CAM>\t\u001a")), method244(method243("CAM>\u000f\u001a")), method244(method243("CAM>\u000e\u001a"))};
   @OriginalMember(
      owner = "client!qaa",
      name = "n",
      descriptor = "I"
   )
   public static int field357 = 0;
   @OriginalMember(
      owner = "client!qaa",
      name = "k",
      descriptor = "I"
   )
   public int field355;
   @OriginalMember(
      owner = "client!qaa",
      name = "j",
      descriptor = "I"
   )
   public static int field356;
   @OriginalMember(
      owner = "client!qaa",
      name = "m",
      descriptor = "I"
   )
   public static int field358;
   @OriginalMember(
      owner = "client!qaa",
      name = "l",
      descriptor = "Luaa;"
   )
   public static class126 field360;

   @OriginalMember(
      owner = "client!qaa",
      name = "b",
      descriptor = "(B)V"
   )
   public abstract void method238(byte arg0);

   @OriginalMember(
      owner = "client!qaa",
      name = "b",
      descriptor = "(ILjagtheora/ogg/OggPacket;)V"
   )
   public final void method239(int arg0, OggPacket arg1) {
      try {
         int var3 = 42 % ((-34 - arg0) / 53);
         ++field358;
         this.method242(16, arg1);
         ++this.field355;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field361[3] + arg0 + ',' + (arg1 != null ? field361[0] : field361[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method240(boolean arg0) {
      try {
         field360 = null;
         if (!arg0) {
            field357 = -30;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field361[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method241(byte arg0) {
      boolean var1 = client.field4273;

      try {
         class149 var2 = (class149)class109.field1381.method1850(0);
         if (var1) {
            class240.method1799((byte)-104, var2.field1946);
            var2 = (class149)class109.field1381.method1847(123);
         }

         while(true) {
            byte var10000;
            int var10001;
            if (var2 == null) {
               var10000 = arg0;
               var10001 = 124;
               if (!var1) {
                  if (arg0 != 124) {
                     method240(false);
                  }

                  ++field356;
                  return;
               }
            } else {
               var10000 = -104;
               var10001 = var2.field1946;
            }

            class240.method1799(var10000, var10001);
            var2 = (class149)class109.field1381.method1847(123);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field361[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(ILjagtheora/ogg/OggPacket;)V"
   )
   public abstract void method242(int arg0, OggPacket arg1);

   @OriginalMember(
      owner = "client!qaa",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class29(OggStreamState arg0) {
      try {
         this.field359 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field361[1] + (arg0 != null ? field361[0] : field361[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method243(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method244(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
