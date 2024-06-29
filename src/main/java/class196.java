import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class196 extends class22 {
   @OriginalMember(
      owner = "client!c",
      name = "p",
      descriptor = "Lho;"
   )
   public class159 field2966;
   @OriginalMember(
      owner = "client!c",
      name = "s",
      descriptor = "Z"
   )
   public boolean field2955;
   @OriginalMember(
      owner = "client!c",
      name = "k",
      descriptor = "I"
   )
   public int field2964;
   @OriginalMember(
      owner = "client!c",
      name = "t",
      descriptor = "I"
   )
   public int field2963;
   @OriginalMember(
      owner = "client!c",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2967 = new String[]{method1699(method1698("\u0000rvT")), method1699(method1698("\r)X\u0010")), method1699(method1698("\u0000r\b\u0015S\n(\nT")), method1699(method1698("\u0018r\u001aR@")), method1699(method1698("\u0000rwT")), method1699(method1698("\u0000ruT"))};
   @OriginalMember(
      owner = "client!c",
      name = "n",
      descriptor = "I"
   )
   public static int field2957 = 1401;
   @OriginalMember(
      owner = "client!c",
      name = "m",
      descriptor = "I"
   )
   public static int field2962 = 0;
   @OriginalMember(
      owner = "client!c",
      name = "j",
      descriptor = "Luw;"
   )
   public static class435 field2965 = new class435(20, 2);
   @OriginalMember(
      owner = "client!c",
      name = "u",
      descriptor = "I"
   )
   public static int field2956;
   @OriginalMember(
      owner = "client!c",
      name = "l",
      descriptor = "I"
   )
   public static int field2960;
   @OriginalMember(
      owner = "client!c",
      name = "r",
      descriptor = "Z"
   )
   public boolean field2958;
   @OriginalMember(
      owner = "client!c",
      name = "o",
      descriptor = "Z"
   )
   public boolean field2959;
   @OriginalMember(
      owner = "client!c",
      name = "q",
      descriptor = "Z"
   )
   public boolean field2961;

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1695(int arg0) {
      try {
         int var1 = -78 / ((-69 - arg0) / 53);
         field2965 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2967[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(I[BII)[B"
   )
   public static final byte[] method1696(int arg0, byte[] arg1, int arg2, int arg3) {
      boolean var4 = client.field4564;

      try {
         byte[] var5;
         label37: {
            ++field2956;
            if (arg2 <= arg3) {
               var5 = arg1;
               if (!var4) {
                  break label37;
               }
            }

            var5 = new byte[arg0];
            int var6 = 0;
            if (var4 || var6 < arg0) {
               do {
                  var5[var6] = arg1[arg2 + var6];
                  ++var6;
               } while(var6 < arg0);
            }
         }

         class593 var7 = new class593();
         var7.method4379((byte)127);
         var7.method4374(var5, false, (long)(arg0 * 8));
         byte[] var8 = new byte[64];
         var7.method4376(var8, (byte)-5, 0);
         return var8;
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field2967[4] + arg0 + ',' + (arg1 != null ? field2967[3] : field2967[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1697(byte arg0) {
      try {
         if (arg0 == 120) {
            ++field2960;
            class262.field3722 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2967[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "<init>",
      descriptor = "(ILho;IZ)V"
   )
   public class196(int arg0, class159 arg1, int arg2, boolean arg3) {
      try {
         this.field2966 = arg1;
         this.field2955 = arg3;
         this.field2964 = arg2;
         this.field2963 = arg0;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2967[2] + arg0 + ',' + (arg1 != null ? field2967[3] : field2967[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1698(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!c",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1699(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
