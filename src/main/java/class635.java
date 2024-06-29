import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class635 {
   @OriginalMember(
      owner = "client!cs",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9346 = new String[]{method4679(method4678("\u0012\u0013MM6")), method4679(method4678("\nNM c")), method4679(method4678("\u0007H\u000f\u000f")), method4679(method4678("\nNM\"c")), method4679(method4678("\nNM!c"))};
   @OriginalMember(
      owner = "client!cs",
      name = "c",
      descriptor = "I"
   )
   public static int field9342 = -1;
   @OriginalMember(
      owner = "client!cs",
      name = "b",
      descriptor = "C"
   )
   public char field9344;
   @OriginalMember(
      owner = "client!cs",
      name = "e",
      descriptor = "I"
   )
   public int field9338;
   @OriginalMember(
      owner = "client!cs",
      name = "h",
      descriptor = "I"
   )
   public static int field9339;
   @OriginalMember(
      owner = "client!cs",
      name = "g",
      descriptor = "I"
   )
   public int field9340;
   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "I"
   )
   public static int field9341;
   @OriginalMember(
      owner = "client!cs",
      name = "d",
      descriptor = "I"
   )
   public static int field9343;
   @OriginalMember(
      owner = "client!cs",
      name = "f",
      descriptor = "I"
   )
   public int field9345;

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(ILgea;Z)V"
   )
   private final void method4675(int arg0, class66 arg1, boolean arg2) {
      try {
         ++field9343;
         if (arg2) {
            this.field9338 = -91;
         }

         if (arg0 == 1) {
            this.field9344 = class123.method1076(arg1.method628((byte)-12), -25094);
         } else if (~arg0 == -3) {
            this.field9345 = arg1.method603(-2);
            this.field9340 = arg1.method640(255);
            this.field9338 = arg1.method640(255);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field9346[4] + arg0 + ',' + (arg1 != null ? field9346[0] : field9346[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(BLgea;)V"
   )
   public final void method4676(byte arg0, class66 arg1) {
      boolean var3 = client.field1481;

      try {
         ++field9341;

         while(true) {
            int var4 = arg1.method640(255);
            if (~var4 != -1) {
               this.method4675(var4, arg1, false);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg0 > -108) {
               this.field9344 = (char)65493;
               return;
            }
            break;
         }

      } catch (RuntimeException var6) {
         throw class93.method866(var6, field9346[1] + arg0 + ',' + (arg1 != null ? field9346[0] : field9346[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "([BZ)[B"
   )
   public static final byte[] method4677(byte[] arg0, boolean arg1) {
      try {
         ++field9339;
         class66 var2 = new class66(arg0);
         int var3 = var2.method640(255);
         int var4 = var2.method610(-28);
         if (arg1) {
            method4677((byte[])null, true);
         }

         if (~var4 > -1 || ~class209.field2652 != -1 && class209.field2652 < var4) {
            throw new RuntimeException();
         } else if (var3 == 0) {
            byte[] var8 = new byte[var4];
            var2.method632(0, var4, (byte)35, var8);
            return var8;
         } else {
            int var5 = var2.method610(-25);
            if (~var5 > -1 || class209.field2652 != 0 && var5 > class209.field2652) {
               throw new RuntimeException();
            } else {
               byte[] var6 = new byte[var5];
               if (var3 == 1) {
                  class388.method3060(var6, var5, arg0, var4, 9);
                  if (!client.field1481) {
                     return var6;
                  }
               }

               class2 var7 = class202.field2573;
               synchronized(class202.field2573) {
                  class202.field2573.method14(var2, var6, 8);
               }

               return var6;
            }
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field9346[3] + (arg0 != null ? field9346[0] : field9346[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4678(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4679(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
