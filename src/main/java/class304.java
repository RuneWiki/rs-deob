import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class304 {
   @OriginalMember(
      owner = "client!qg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4258 = new String[]{method2439(method2438("ba_+2")), method2439(method2438("}s\u001d\u0006")), method2439(method2438("h(_Dg")), method2439(method2438("ba_(2"))};
   @OriginalMember(
      owner = "client!qg",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field4252 = false;
   @OriginalMember(
      owner = "client!qg",
      name = "h",
      descriptor = "I"
   )
   public static int field4255 = 0;
   @OriginalMember(
      owner = "client!qg",
      name = "b",
      descriptor = "C"
   )
   public char field4254;
   @OriginalMember(
      owner = "client!qg",
      name = "f",
      descriptor = "I"
   )
   public static int field4249;
   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "I"
   )
   public int field4250;
   @OriginalMember(
      owner = "client!qg",
      name = "i",
      descriptor = "I"
   )
   public static int field4251;
   @OriginalMember(
      owner = "client!qg",
      name = "d",
      descriptor = "I"
   )
   public static int field4253;
   @OriginalMember(
      owner = "client!qg",
      name = "e",
      descriptor = "I"
   )
   public int field4256;
   @OriginalMember(
      owner = "client!qg",
      name = "c",
      descriptor = "I"
   )
   public int field4257;

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(ILgea;)V"
   )
   public final void method2436(int arg0, class66 arg1) {
      boolean var3 = client.field1481;

      try {
         if (arg0 != 0) {
            field4253 = -59;
         }

         ++field4251;

         do {
            int var4 = arg1.method640(arg0 + 255);
            if (var4 == 0) {
               break;
            }

            this.method2437(arg1, (byte)12, var4);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class93.method866(var6, field4258[0] + arg0 + ',' + (arg1 != null ? field4258[2] : field4258[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(Lgea;BI)V"
   )
   private final void method2437(class66 arg0, byte arg1, int arg2) {
      try {
         if (arg1 != 12) {
            this.field4254 = (char)65484;
         }

         ++field4249;
         if (~arg2 != -2) {
            if (arg2 == 3) {
               this.field4257 = arg0.method603(-2);
               this.field4250 = arg0.method640(255);
               this.field4256 = arg0.method640(255);
               return;
            }
         } else {
            this.field4254 = class123.method1076(arg0.method628((byte)-12), -25094);
         }

      } catch (RuntimeException var5) {
         throw class93.method866(var5, field4258[3] + (arg0 != null ? field4258[2] : field4258[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   static {
      new BitSet(65536);
   }

   @OriginalMember(
      owner = "client!qg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2438(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2439(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 106;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
