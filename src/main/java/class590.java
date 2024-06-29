import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class590 {
   @OriginalMember(
      owner = "client!wm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8731 = new String[]{method4346(method4345("hO)[")), method4346(method4345("}\u0014k\u0019\r")), method4346(method4345("qWkvX")), method4346(method4345("qWkuX")), method4346(method4345("qWktX")), method4346(method4345("qWkC\u001fUN7^\u001ea\u0012"))};
   @OriginalMember(
      owner = "client!wm",
      name = "b",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field8725 = new String[100];
   @OriginalMember(
      owner = "client!wm",
      name = "c",
      descriptor = "I"
   )
   public static int field8726 = -1;
   @OriginalMember(
      owner = "client!wm",
      name = "d",
      descriptor = "I"
   )
   public static int field8727;
   @OriginalMember(
      owner = "client!wm",
      name = "a",
      descriptor = "I"
   )
   public static int field8728;
   @OriginalMember(
      owner = "client!wm",
      name = "e",
      descriptor = "I"
   )
   public static int field8729;
   @OriginalMember(
      owner = "client!wm",
      name = "f",
      descriptor = "I"
   )
   public static int field8730;

   @OriginalMember(
      owner = "client!wm",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4342(int arg0) {
      try {
         field8725 = null;
         if (arg0 > -80) {
            method4342(-3);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8731[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wm",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field8727;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8731[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!wm",
      name = "a",
      descriptor = "(III)I"
   )
   public final int method4343(int arg0, int arg1, int arg2) {
      try {
         ++field8730;
         int var4 = ~arg1 <= ~class207.field2647 ? arg1 : class207.field2647;
         if (class278.field3879 == this) {
            return 0;
         } else {
            if (arg0 < 14) {
               this.toString();
            }

            if (class793.field11536 == this) {
               return -arg2 + var4;
            } else {
               return class781.field11403 == this ? (-arg2 + var4) / 2 : 0;
            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field8731[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wm",
      name = "a",
      descriptor = "(ILjava/lang/String;)Z"
   )
   public static final boolean method4344(int arg0, String arg1) {
      int var2 = client.field4530;

      try {
         ++field8729;
         if (arg1 == null) {
            return false;
         } else {
            int var3 = 0;
            if (var2 != 0) {
               if (arg1.equalsIgnoreCase(class751.field11119[var3])) {
                  return true;
               }

               ++var3;
            }

            while(true) {
               while(class423.field6418 > var3) {
                  if (arg1.equalsIgnoreCase(class751.field11119[var3])) {
                     return true;
                  }

                  ++var3;
               }

               if (var2 == 0) {
                  if (arg0 > -98) {
                     field8725 = null;
                  }

                  if (arg1.equalsIgnoreCase(class693.field10418.field10332)) {
                     return true;
                  }

                  return false;
               }

               if (arg0 != 0) {
                  return true;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field8731[2] + arg0 + ',' + (arg1 != null ? field8731[1] : field8731[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4345(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4346(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 58;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
