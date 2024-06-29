import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class24 {
   @OriginalMember(
      owner = "client!qo",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public String field254;
   @OriginalMember(
      owner = "client!qo",
      name = "d",
      descriptor = "I"
   )
   public int field256;
   @OriginalMember(
      owner = "client!qo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field257 = new String[]{method162(method161("W-*\u0002\u0013")), method162(method161("W-*7Tu6v*UAj")), method162(method161("H7h/")), method162(method161("]l*mF")), method162(method161("W-*\u007fRH+p}\u0013")), method162(method161("W-*\u0001\u0013")), method162(method161("I2a-QU"))};
   @OriginalMember(
      owner = "client!qo",
      name = "e",
      descriptor = "I"
   )
   public static int field252;
   @OriginalMember(
      owner = "client!qo",
      name = "c",
      descriptor = "I"
   )
   public static int field253;
   @OriginalMember(
      owner = "client!qo",
      name = "b",
      descriptor = "I"
   )
   public static int field255;

   @OriginalMember(
      owner = "client!qo",
      name = "a",
      descriptor = "(I)I",
      line = 4
   )
   public static final int method159(int arg0) {
      int var1 = client.field4530;

      try {
         ++field255;
         class66 var2 = class786.field11439;
         boolean var3 = false;
         if (class261.field3566.field9464.method4225(109) != 0) {
            Canvas var4 = new Canvas();
            var4.setSize(100, 100);
            var2 = class745.method5429((class160)null, 0, (class526)null, var4, 0, false);
            var3 = true;
         }

         long var5 = class188.method1462(true);
         if (arg0 != 1) {
            return 117;
         } else {
            int var7 = 0;
            if (var1 != 0) {
               var2.method552(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
               ++var7;
            }

            while(true) {
               while(~var7 > -10001) {
                  var2.method552(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
                  ++var7;
               }

               int var8 = (int)(class188.method1462(true) - var5);
               var2.method609(arg0, 100, 0, 100, 0, -16777216);
               if (var1 == 0) {
                  if (var3) {
                     var2.method653(-126);
                  }

                  return var8;
               }

               ++var7;
            }
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field257[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qo",
      name = "a",
      descriptor = "(ZLjava/lang/String;IZLhg;)V",
      line = 52
   )
   public static final void method160(boolean arg0, String arg1, int arg2, boolean arg3, class719 arg4) {
      try {
         class489.method3626(arg1, field257[6], 0, arg0, arg4, arg3);
         if (arg2 == 1011) {
            ++field252;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field257[5] + arg0 + ',' + (arg1 != null ? field257[3] : field257[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field257[3] : field257[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qo",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
      line = 65
   )
   public class24(String arg0, String arg1, int arg2) {
      try {
         this.field254 = arg0;
         this.field256 = arg2;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field257[4] + (arg0 != null ? field257[3] : field257[2]) + ',' + (arg1 != null ? field257[3] : field257[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qo",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 76
   )
   public final String toString() {
      try {
         ++field253;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field257[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!qo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method161(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method162(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 38;
            break;
         case 1:
            var10005 = 66;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 67;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
