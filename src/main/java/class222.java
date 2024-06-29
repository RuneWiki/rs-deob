import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class222 implements class680 {
   @OriginalMember(
      owner = "client!fp",
      name = "f",
      descriptor = "Ljava/lang/String;"
   )
   private String field3157;
   @OriginalMember(
      owner = "client!fp",
      name = "g",
      descriptor = "Lsa;"
   )
   private class39 field3161;
   @OriginalMember(
      owner = "client!fp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3162 = new String[]{method1914(method1913("\u0018\u001dcg\u001d")), method1914(method1913("\u0018\u001dcd\u001d")), method1914(method1913("\u0018\u001dcf\u001d")), method1914(method1913("\u0005Cc\u000bH")), method1914(method1913("\u0010\u0018!I")), method1914(method1913("\u0018\u001dc\u0019\\\u0010\u00049\u001b\u001d")), method1914(method1913("\u0018\u001dca\u001d"))};
   @OriginalMember(
      owner = "client!fp",
      name = "h",
      descriptor = "I"
   )
   public static int field3154;
   @OriginalMember(
      owner = "client!fp",
      name = "e",
      descriptor = "I"
   )
   public static int field3155;
   @OriginalMember(
      owner = "client!fp",
      name = "c",
      descriptor = "I"
   )
   public static int field3156;
   @OriginalMember(
      owner = "client!fp",
      name = "b",
      descriptor = "I"
   )
   public static int field3158;
   @OriginalMember(
      owner = "client!fp",
      name = "d",
      descriptor = "I"
   )
   public static int field3160;
   @OriginalMember(
      owner = "client!fp",
      name = "a",
      descriptor = "Lsa;"
   )
   public static class39 field3159;

   @OriginalMember(
      owner = "client!fp",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method1763(byte arg0) {
      try {
         ++field3156;
         if (this.field3161.method445(this.field3157, -4)) {
            return 100;
         } else {
            if (arg0 >= -66) {
               field3159 = null;
            }

            return 0;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3162[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fp",
      name = "a",
      descriptor = "(B)Leo;"
   )
   public final class344 method1760(byte arg0) {
      try {
         ++field3154;
         if (arg0 != 54) {
            this.method1760((byte)89);
         }

         return class344.field5063;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3162[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fp",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method1911(byte arg0) {
      try {
         field3159 = null;
         if (arg0 > -17) {
            field3158 = 29;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3162[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fp",
      name = "a",
      descriptor = "(Ljava/lang/String;ILcu;)I"
   )
   public static final int method1912(String arg0, int arg1, class65 arg2) {
      try {
         ++field3155;
         int var3 = arg2.field945;
         byte[] var4 = class522.method3895(arg0, arg1);
         arg2.method703(true, var4.length);
         arg2.field945 += class779.field11376.method5659(-6406, arg2.field945, var4.length, 0, var4, arg2.field942);
         return arg2.field945 - var3;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3162[2] + (arg0 != null ? field3162[3] : field3162[4]) + ',' + arg1 + ',' + (arg2 != null ? field3162[3] : field3162[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fp",
      name = "<init>",
      descriptor = "(Lsa;Ljava/lang/String;)V"
   )
   public class222(class39 arg0, String arg1) {
      try {
         this.field3157 = arg1;
         this.field3161 = arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3162[5] + (arg0 != null ? field3162[3] : field3162[4]) + ',' + (arg1 != null ? field3162[3] : field3162[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1913(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1914(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 126;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 37;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
