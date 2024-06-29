import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class240 {
   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "Lkf;"
   )
   private class266 field3348;
   @OriginalMember(
      owner = "client!rt",
      name = "d",
      descriptor = "I"
   )
   public int field3349;
   @OriginalMember(
      owner = "client!rt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3351 = new String[]{method1842(method1841("@p-d")), method1842(method1841("U+o&\\")), method1842(method1841("\\qo4H@l56\t")), method1842(method1841("\\qoI\t"))};
   @OriginalMember(
      owner = "client!rt",
      name = "b",
      descriptor = "I"
   )
   public static int field3347;
   @OriginalMember(
      owner = "client!rt",
      name = "c",
      descriptor = "J"
   )
   public static long field3350;

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(B)Z"
   )
   public static final boolean method1840(byte arg0) {
      boolean var1 = client.field4360;

      try {
         ++field3347;
         boolean var2 = true;
         if (class595.field8750 == null) {
            label68: {
               if (class281.field3904.method2051(class746.field10937, (byte)60)) {
                  class595.field8750 = class439.method3235(class281.field3904, class746.field10937);
                  if (!var1) {
                     break label68;
                  }
               }

               var2 = false;
            }
         }

         if (class655.field9584 == null) {
            label62: {
               if (!class281.field3904.method2051(class41.field572, (byte)60)) {
                  var2 = false;
                  if (!var1) {
                     break label62;
                  }
               }

               class655.field9584 = class439.method3235(class281.field3904, class41.field572);
            }
         }

         if (class25.field393 == null) {
            label56: {
               if (class281.field3904.method2051(class470.field6755, (byte)60)) {
                  class25.field393 = class439.method3235(class281.field3904, class470.field6755);
                  if (!var1) {
                     break label56;
                  }
               }

               var2 = false;
            }
         }

         if (arg0 != -28) {
            method1840((byte)0);
         }

         if (class25.field385 == null) {
            label49: {
               if (class487.field6954.method2051(class94.field1224, (byte)60)) {
                  class25.field385 = class73.method674(class94.field1224, class487.field6954, (byte)122);
                  if (!var1) {
                     break label49;
                  }
               }

               var2 = false;
            }
         }

         if (class235.field3278 == null) {
            if (!class281.field3904.method2051(class94.field1224, (byte)60)) {
               var2 = false;
               if (!var1) {
                  return var2;
               }
            }

            class235.field3278 = class439.method3232(class281.field3904, class94.field1224);
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3351[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "<init>",
      descriptor = "(Lno;ILkf;)V"
   )
   public class240(class732 arg0, int arg1, class266 arg2) {
      new class80(64);

      try {
         this.field3348 = arg2;
         this.field3349 = this.field3348.method2060(2, 15);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field3351[2] + (arg0 != null ? field3351[1] : field3351[0]) + ',' + arg1 + ',' + (arg2 != null ? field3351[1] : field3351[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1841(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 33);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1842(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 33;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
