import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class139 extends class15 {
   @OriginalMember(
      owner = "client!nd",
      name = "B",
      descriptor = "I"
   )
   public int field1757 = 0;
   @OriginalMember(
      owner = "client!nd",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1760 = new String[]{method1158(method1157("\u0006_z,\u0013")), method1158(method1157("\u0006N8\u0002")), method1158(method1157("\u0013\u0015z@F")), method1158(method1157("\u0006_z*\u0013")), method1158(method1157("\u0006_z/\u0013")), method1158(method1157("\u0006_z-\u0013"))};
   @OriginalMember(
      owner = "client!nd",
      name = "v",
      descriptor = "I"
   )
   public static int field1754 = 1338;
   @OriginalMember(
      owner = "client!nd",
      name = "t",
      descriptor = "I"
   )
   public static int field1755 = -1;
   @OriginalMember(
      owner = "client!nd",
      name = "u",
      descriptor = "F"
   )
   public static float field1756;
   @OriginalMember(
      owner = "client!nd",
      name = "w",
      descriptor = "I"
   )
   public static int field1751;
   @OriginalMember(
      owner = "client!nd",
      name = "y",
      descriptor = "I"
   )
   public static int field1752;
   @OriginalMember(
      owner = "client!nd",
      name = "z",
      descriptor = "I"
   )
   public static int field1758;
   @OriginalMember(
      owner = "client!nd",
      name = "s",
      descriptor = "I"
   )
   public static int field1759;
   @OriginalMember(
      owner = "client!nd",
      name = "x",
      descriptor = "Lit;"
   )
   public static class769 field1753;

   @OriginalMember(
      owner = "client!nd",
      name = "a",
      descriptor = "(Lgea;I)V"
   )
   public final void method1153(class66 arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         while(true) {
            int var4 = arg0.method640(arg1 + 256);
            if (~var4 != -1) {
               this.method1154(106, arg0, var4);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field1758;
            break;
         }

         if (arg1 != -1) {
            field1753 = null;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field1760[4] + (arg0 != null ? field1760[2] : field1760[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   private final void method1154(int arg0, class66 arg1, int arg2) {
      try {
         if (arg0 >= 7) {
            if (arg2 == 2) {
               this.field1757 = arg1.method603(-2);
            }

            ++field1752;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1760[3] + arg0 + ',' + (arg1 != null ? field1760[2] : field1760[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1155(int arg0) {
      try {
         if (arg0 < 118) {
            method1155(-49);
         }

         field1753 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1760[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "a",
      descriptor = "(Ljava/lang/String;I)J"
   )
   public static final long method1156(String arg0, int arg1) {
      boolean var2 = client.field1481;

      try {
         ++field1751;
         int var3 = arg0.length();
         long var4 = 0L;
         int var6 = 0;
         if (var2) {
            var4 = (var4 << 5) + -var4 - -((long)arg0.charAt(var6));
            ++var6;
         }

         while(true) {
            while(~var6 > ~var3) {
               var4 = (var4 << 5) + -var4 - -((long)arg0.charAt(var6));
               ++var6;
            }

            int var7 = -99 / ((48 - arg1) / 61);
            if (!var2) {
               return var4;
            }

            var4 = var4;
            ++var6;
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field1760[0] + (arg0 != null ? field1760[2] : field1760[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1157(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1158(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 110;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
