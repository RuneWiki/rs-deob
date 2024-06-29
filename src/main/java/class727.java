import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class727 {
   @OriginalMember(
      owner = "client!ib",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10613 = new String[]{method5261(method5260("'3\u0014\u0017\u0006")), method5261(method5260("'3\u0014\u0014\u0006"))};
   @OriginalMember(
      owner = "client!ib",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field10612 = false;
   @OriginalMember(
      owner = "client!ib",
      name = "b",
      descriptor = "I"
   )
   public static int field10608 = -1;
   @OriginalMember(
      owner = "client!ib",
      name = "d",
      descriptor = "I"
   )
   public static int field10607;
   @OriginalMember(
      owner = "client!ib",
      name = "a",
      descriptor = "I"
   )
   public static int field10609;
   @OriginalMember(
      owner = "client!ib",
      name = "f",
      descriptor = "I"
   )
   public static int field10610;
   @OriginalMember(
      owner = "client!ib",
      name = "c",
      descriptor = "I"
   )
   public static int field10611;

   @OriginalMember(
      owner = "client!ib",
      name = "a",
      descriptor = "(Z)J"
   )
   public static final long method5258(boolean arg0) {
      try {
         if (arg0) {
            method5259(-12, 49);
         }

         ++field10609;
         return class569.field8365.method237((byte)80);
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10613[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ib",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method5259(int arg0, int arg1) {
      try {
         ++field10607;
         int var2 = class413.field5678 - class468.field6438;
         if (var2 >= 100) {
            class784.field11454 = 1;
            class574.field8442 = -1;
            class81.field1137 = -1;
         } else {
            int var3 = (int)class250.field3162;
            if (arg0 == 128) {
               if (~(class422.field5759 >> 8) < ~var3) {
                  var3 = class422.field5759 >> 8;
               }

               if (class203.field2587[4] && ~(class170.field2215[4] + 128) < ~var3) {
                  var3 = class170.field2215[4] + 128;
               }

               float var5;
               int var6;
               label33: {
                  int var4 = (int)class623.field9202 + class87.field1192 & 16383;
                  class100.method905(var3, (byte)-72, arg1, (var3 >> 3) * 3 + 600 << 2, class70.field942, -200 + class215.method1757(class204.field2593.field10467, false, class674.field9984, class204.field2593.field10468), var4, class95.field1290);
                  var5 = 1.0F - (float)((100 - var2) * (-var2 + 100) * (-var2 + 100)) / 1000000.0F;
                  class160.field2051 = (int)((float)(-class363.field5035 + class160.field2051) * var5 + (float)class363.field5035);
                  class653.field9755 = (int)((float)(class653.field9755 - class381.field5302) * var5 + (float)class381.field5302);
                  class168.field2195 = (int)((float)(-class398.field5483 + class168.field2195) * var5 + (float)class398.field5483);
                  class546.field8031 = (int)((float)(-class82.field1158 + class546.field8031) * var5 + (float)class82.field1158);
                  var6 = -class63.field797 + class242.field3054;
                  if (~var6 >= -8193) {
                     if (~var6 <= 8191) {
                        break label33;
                     }

                     var6 += 16384;
                     if (!client.field1481) {
                        break label33;
                     }
                  }

                  var6 -= 16384;
               }

               class242.field3054 = (int)((float)var6 * var5 + (float)class63.field797);
               class242.field3054 &= 16383;
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field10613[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ib",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5260(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ib",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5261(char[] arg0) {
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
            var10005 = 81;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
