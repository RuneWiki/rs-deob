import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public abstract class class338 {
   @OriginalMember(
      owner = "client!ne",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4606 = new String[]{method2492(method2491("S\u001f/v")), method2492(method2491("FDm4V")), method2492(method2491("S\u000fm_\u0003")), method2492(method2491("S\u000fm^\u0003"))};
   @OriginalMember(
      owner = "client!ne",
      name = "j",
      descriptor = "[S"
   )
   private static short[] field4596 = new short[]{6798, 8741, 25238, 4626, 4550};
   @OriginalMember(
      owner = "client!ne",
      name = "e",
      descriptor = "[S"
   )
   private static short[] field4601 = new short[]{-1, -1, -1, -1, -1};
   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "[S"
   )
   private static short[] field4599 = new short[]{-10304, 9104, 25485, 4620, 4540};
   @OriginalMember(
      owner = "client!ne",
      name = "i",
      descriptor = "[[S"
   )
   public static short[][] field4597 = new short[][]{field4596, field4599, field4601};
   @OriginalMember(
      owner = "client!ne",
      name = "h",
      descriptor = "[B"
   )
   public static byte[] field4598;
   @OriginalMember(
      owner = "client!ne",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field4604;
   @OriginalMember(
      owner = "client!ne",
      name = "c",
      descriptor = "I"
   )
   public static int field4603;
   @OriginalMember(
      owner = "client!ne",
      name = "f",
      descriptor = "F"
   )
   public static float field4602;
   @OriginalMember(
      owner = "client!ne",
      name = "g",
      descriptor = "I"
   )
   public static int field4600;
   @OriginalMember(
      owner = "client!ne",
      name = "d",
      descriptor = "I"
   )
   public static int field4605;

   @OriginalMember(
      owner = "client!ne",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method2489(boolean arg0) {
      try {
         field4598 = null;
         field4596 = null;
         field4597 = null;
         field4599 = null;
         field4604 = null;
         if (arg0) {
            field4601 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4606[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(II[BI)V"
   )
   public abstract void method1381(int arg0, int arg1, byte[] arg2, int arg3) throws IOException;

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(Z)V"
   )
   public abstract void method1377(boolean arg0);

   @OriginalMember(
      owner = "client!ne",
      name = "b",
      descriptor = "(II[BI)I"
   )
   public abstract int method1379(int arg0, int arg1, byte[] arg2, int arg3) throws IOException;

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(ILbl;)Lbl;"
   )
   public static final class678 method2490(int arg0, class678 arg1) {
      try {
         ++field4600;
         class678 var2 = client.method2347(arg1);
         int var3 = 122 / ((52 - arg0) / 60);
         if (var2 == null) {
            var2 = arg1.field9895;
         }

         return var2;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field4606[2] + arg0 + ',' + (arg1 != null ? field4606[1] : field4606[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method1378(int arg0);

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(IZ)Z"
   )
   public abstract boolean method1380(int arg0, boolean arg1) throws IOException;

   static {
      int var0 = 0;
      field4598 = new byte[32896];

      for(int var1 = 0; var1 < 256; ++var1) {
         for(int var2 = 0; ~var1 <= ~var2; ++var2) {
            field4598[var0++] = (byte)((int)(255.0D / Math.sqrt((double)((float)(var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
         }
      }

      field4604 = new int[25];
      field4603 = 0;
   }

   @OriginalMember(
      owner = "client!ne",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2491(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ne",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2492(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 61;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
