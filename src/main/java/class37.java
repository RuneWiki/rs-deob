import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class37 extends class354 {
   @OriginalMember(
      owner = "client!fc",
      name = "Sb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field455 = new String[]{method270(method269("PT\u00148)")), method270(method269("PT\u0014>)")), method270(method269("PT\u00149)")), method270(method269("PT\u0014?)")), method270(method269("M\u0019\u0014S|")), method270(method269("XBV\u0011")), method270(method269("PT\u0014<)"))};
   @OriginalMember(
      owner = "client!fc",
      name = "Ob",
      descriptor = "[I"
   )
   public static int[] field445 = new int[5];
   @OriginalMember(
      owner = "client!fc",
      name = "Lb",
      descriptor = "I"
   )
   public static int field453 = -1;
   @OriginalMember(
      owner = "client!fc",
      name = "Mb",
      descriptor = "I"
   )
   public static int field454 = 0;
   @OriginalMember(
      owner = "client!fc",
      name = "Jb",
      descriptor = "D"
   )
   public static double field452;
   @OriginalMember(
      owner = "client!fc",
      name = "Hb",
      descriptor = "I"
   )
   public static int field444;
   @OriginalMember(
      owner = "client!fc",
      name = "Nb",
      descriptor = "I"
   )
   public static int field446;
   @OriginalMember(
      owner = "client!fc",
      name = "Ib",
      descriptor = "I"
   )
   public static int field447;
   @OriginalMember(
      owner = "client!fc",
      name = "Rb",
      descriptor = "I"
   )
   public static int field449;
   @OriginalMember(
      owner = "client!fc",
      name = "Pb",
      descriptor = "I"
   )
   public static int field450;
   @OriginalMember(
      owner = "client!fc",
      name = "Qb",
      descriptor = "I"
   )
   public static int field451;
   @OriginalMember(
      owner = "client!fc",
      name = "Kb",
      descriptor = "Lgb;"
   )
   public static class29 field448;

   @OriginalMember(
      owner = "client!fc",
      name = "a",
      descriptor = "(BLjava/lang/String;)Z"
   )
   public static final boolean method264(byte arg0, String arg1) {
      boolean var2 = client.field1786;

      try {
         ++field451;
         if (arg1 == null) {
            return false;
         } else {
            int var3 = 0;
            if (arg0 <= 125) {
               method267((byte)38);
               if (var2) {
                  if (arg1.equalsIgnoreCase(class121.field1731[var3])) {
                     return true;
                  }

                  if (arg1.equalsIgnoreCase(class115.field1559[var3])) {
                     return true;
                  }

                  ++var3;
               }
            }

            while(true) {
               boolean var10000;
               if (class377.field5987 <= var3) {
                  var10000 = false;
                  if (!var2) {
                     return false;
                  }
               } else {
                  var10000 = arg1.equalsIgnoreCase(class121.field1731[var3]);
               }

               if (var10000) {
                  return true;
               }

               if (arg1.equalsIgnoreCase(class115.field1559[var3])) {
                  return true;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field455[3] + arg0 + ',' + (arg1 != null ? field455[4] : field455[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fc",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class37(int arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!fc",
      name = "a",
      descriptor = "(IF)V"
   )
   public final void method265(int arg0, float arg1) {
      try {
         ++field446;
         int var3 = Stream.floatToRawIntBits(arg1);
         super.field5428[super.field5436++] = (byte)(var3 >> 24);
         super.field5428[super.field5436++] = (byte)(var3 >> 16);
         super.field5428[super.field5436++] = (byte)(var3 >> 8);
         if (arg0 != 29481) {
            field449 = -25;
         }

         super.field5428[super.field5436++] = (byte)var3;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field455[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fc",
      name = "b",
      descriptor = "(IF)V"
   )
   public final void method266(int arg0, float arg1) {
      try {
         ++field447;
         int var3 = Stream.floatToRawIntBits(arg1);
         super.field5428[super.field5436++] = (byte)var3;
         super.field5428[super.field5436++] = (byte)(var3 >> 8);
         if (arg0 == 115976568) {
            super.field5428[super.field5436++] = (byte)(var3 >> 16);
            super.field5428[super.field5436++] = (byte)(var3 >> 24);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field455[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fc",
      name = "m",
      descriptor = "(B)V"
   )
   public static void method267(byte arg0) {
      try {
         field448 = null;
         if (arg0 < 116) {
            field444 = -86;
         }

         field445 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field455[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fc",
      name = "l",
      descriptor = "(B)V"
   )
   public static final void method268(byte arg0) {
      try {
         ++field450;
         if (!class570.field8437) {
            class36.method259((byte)-110, class459.field7003);
            if (arg0 <= 22) {
               field452 = -0.3087687202826823D;
            }

            if (class459.field7006 != null) {
               class36.method259((byte)-110, class459.field7006);
            }

            class570.field8437 = true;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field455[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method269(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method270(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
