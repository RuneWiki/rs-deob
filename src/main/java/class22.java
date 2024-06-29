import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class22 extends class428 {
   @OriginalMember(
      owner = "client!gaa",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field328 = new String[]{method302(method301("\u0018oe6]W")), method302(method301("\u0018oe6^W"))};
   @OriginalMember(
      owner = "client!gaa",
      name = "L",
      descriptor = "I"
   )
   public static int field325 = 0;
   @OriginalMember(
      owner = "client!gaa",
      name = "J",
      descriptor = "I"
   )
   public static int field324;
   @OriginalMember(
      owner = "client!gaa",
      name = "M",
      descriptor = "I"
   )
   public static int field326;
   @OriginalMember(
      owner = "client!gaa",
      name = "K",
      descriptor = "I"
   )
   public static int field327;

   @OriginalMember(
      owner = "client!gaa",
      name = "<init>",
      descriptor = "(Lsa;Lsa;Lsq;)V"
   )
   public class22(class39 arg0, class39 arg1, class742 arg2) {
      super(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!gaa",
      name = "e",
      descriptor = "(I)V"
   )
   public static final void method299(int arg0) {
      boolean var1 = client.field10022;

      try {
         ++field326;
         if (arg0 != 4096) {
            method299(-54);
         }

         if (class608.field8660 == null || class458.field6687 == null) {
            class458.field6687 = new int[256];
            class608.field8660 = new int[256];
            int var2 = 0;
            if (var1 || var2 < 256) {
               do {
                  double var3 = (double)var2 / 255.0D * 6.283185307179586D;
                  class608.field8660[var2] = (int)(Math.sin(var3) * 4096.0D);
                  class458.field6687[var2] = (int)(4096.0D * Math.cos(var3));
                  ++var2;
               } while(var2 < 256);
            }
         }

      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field328[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gaa",
      name = "a",
      descriptor = "(IBIII)V"
   )
   public final void method300(int arg0, byte arg1, int arg2, int arg3, int arg4) {
      try {
         ++field327;
         if (arg1 > 101) {
            int var6 = super.field6273.method1351();
            int var7 = ((class742)super.field1580).field10566 * class782.method5646((byte)100) / 10 % var6;
            super.field6273.method1448(-var6 + arg0 + var7, arg3, -var7 + var6 + arg2, arg4);
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field328[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method301(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method302(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 14;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
