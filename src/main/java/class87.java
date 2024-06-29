import java.awt.Canvas;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class87 {
   @OriginalMember(
      owner = "client!cea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1272 = new String[]{method843(method842("|m\u0006\u0018")), method843(method842("q}\u000bZw:")), method843(method842("i6DZH")), method843(method842("q}\u000bZq:")), method843(method842("q}\u000bZt:")), method843(method842("q}\u000bZv:"))};
   @OriginalMember(
      owner = "client!cea",
      name = "i",
      descriptor = "I"
   )
   public static int field1266 = 0;
   @OriginalMember(
      owner = "client!cea",
      name = "c",
      descriptor = "[Lrfa;"
   )
   public static class481[] field1270 = new class481[16];
   @OriginalMember(
      owner = "client!cea",
      name = "e",
      descriptor = "Ljava/math/BigInteger;"
   )
   public static BigInteger field1269 = new BigInteger(method843(method842("#(ZD\u0004")), 16);
   @OriginalMember(
      owner = "client!cea",
      name = "d",
      descriptor = "I"
   )
   public int field1263;
   @OriginalMember(
      owner = "client!cea",
      name = "a",
      descriptor = "I"
   )
   public int field1264;
   @OriginalMember(
      owner = "client!cea",
      name = "h",
      descriptor = "I"
   )
   public static int field1265;
   @OriginalMember(
      owner = "client!cea",
      name = "g",
      descriptor = "I"
   )
   public static int field1267;
   @OriginalMember(
      owner = "client!cea",
      name = "b",
      descriptor = "I"
   )
   public int field1268;
   @OriginalMember(
      owner = "client!cea",
      name = "f",
      descriptor = "I"
   )
   public static int field1271;

   @OriginalMember(
      owner = "client!cea",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method838(int arg0) {
      try {
         field1270 = null;
         if (arg0 >= -24) {
            method839((Canvas)null, -3, (byte)-87, -121, (class150)null);
         }

         field1269 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1272[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cea",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;IBILd;)Lha;"
   )
   public static final class610 method839(Canvas arg0, int arg1, byte arg2, int arg3, class150 arg4) {
      try {
         int var5 = -115 / ((arg2 - 41) / 46);
         ++field1265;
         return new class164(arg0, arg4, arg3, arg1);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field1272[4] + (arg0 != null ? field1272[2] : field1272[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1272[2] : field1272[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cea",
      name = "a",
      descriptor = "(Lica;II)V"
   )
   private final void method840(class354 arg0, int arg1, int arg2) {
      try {
         ++field1271;
         if (arg1 == arg2) {
            this.field1268 = arg0.method2848(-121);
            this.field1264 = arg0.method2855(-31007);
            this.field1263 = arg0.method2855(arg2 ^ -31008);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field1272[5] + (arg0 != null ? field1272[2] : field1272[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cea",
      name = "a",
      descriptor = "(ILica;)V"
   )
   public final void method841(int arg0, class354 arg1) {
      boolean var3 = client.field1786;

      try {
         while(true) {
            int var4 = arg1.method2855(arg0 ^ 4874);
            if (var4 != 0) {
               this.method840(arg1, var4, 1);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg0 != -27157) {
               method838(-64);
            }

            ++field1267;
            break;
         }

      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field1272[1] + arg0 + ',' + (arg1 != null ? field1272[2] : field1272[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method842(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method843(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
