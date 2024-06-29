import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class370 {
   @OriginalMember(
      owner = "client!tu",
      name = "c",
      descriptor = "I"
   )
   public int field5386;
   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "I"
   )
   public int field5368;
   @OriginalMember(
      owner = "client!tu",
      name = "l",
      descriptor = "I"
   )
   private int field5379;
   @OriginalMember(
      owner = "client!tu",
      name = "o",
      descriptor = "I"
   )
   public int field5385;
   @OriginalMember(
      owner = "client!tu",
      name = "i",
      descriptor = "B"
   )
   public byte field5374;
   @OriginalMember(
      owner = "client!tu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5387 = new String[]{method2831(method2830("\u0003BQg<")), method2831(method2830("\u0003BQ\u001a}\u0019^\u000b\u0018<")), method2831(method2830("\u0003BQd<")), method2831(method2830("\f\u0019Q\bi")), method2831(method2830("\u0019B\u0013J")), method2831(method2830("\u0003BQe<"))};
   @OriginalMember(
      owner = "client!tu",
      name = "e",
      descriptor = "I"
   )
   public static int field5384 = 0;
   @OriginalMember(
      owner = "client!tu",
      name = "r",
      descriptor = "I"
   )
   public int field5369;
   @OriginalMember(
      owner = "client!tu",
      name = "d",
      descriptor = "I"
   )
   public static int field5370;
   @OriginalMember(
      owner = "client!tu",
      name = "m",
      descriptor = "I"
   )
   public int field5371;
   @OriginalMember(
      owner = "client!tu",
      name = "j",
      descriptor = "I"
   )
   public static int field5372;
   @OriginalMember(
      owner = "client!tu",
      name = "s",
      descriptor = "I"
   )
   public int field5373;
   @OriginalMember(
      owner = "client!tu",
      name = "n",
      descriptor = "I"
   )
   public int field5375;
   @OriginalMember(
      owner = "client!tu",
      name = "p",
      descriptor = "I"
   )
   public int field5376;
   @OriginalMember(
      owner = "client!tu",
      name = "h",
      descriptor = "I"
   )
   public static int field5378;
   @OriginalMember(
      owner = "client!tu",
      name = "k",
      descriptor = "I"
   )
   public int field5380;
   @OriginalMember(
      owner = "client!tu",
      name = "b",
      descriptor = "I"
   )
   public int field5381;
   @OriginalMember(
      owner = "client!tu",
      name = "q",
      descriptor = "I"
   )
   public int field5382;
   @OriginalMember(
      owner = "client!tu",
      name = "g",
      descriptor = "I"
   )
   public int field5383;
   @OriginalMember(
      owner = "client!tu",
      name = "f",
      descriptor = "Ltu;"
   )
   public class370 field5377;

   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "(ILjava/lang/String;)V"
   )
   public static final void method2827(int arg0, String arg1) {
      boolean var2 = client.field4360;

      try {
         ++field5372;
         if (arg1 != null) {
            String var3 = class738.method5357(-24, arg1);
            if (var3 != null) {
               int var4 = 0;
               if (var2 || class710.field10360 > var4) {
                  label70:
                  do {
                     String var5 = class581.field8554[var4];
                     String var6 = class738.method5357(-57, var5);
                     if (!class525.method3803(var5, var3, -18357, arg1, var6)) {
                        ++var4;
                     } else {
                        --class710.field10360;
                        int var7 = var4;
                        if (var2) {
                           class581.field8554[var4] = class581.field8554[var4 + 1];
                           class9.field88[var4] = class9.field88[var4 - -1];
                           class317.field4325[var4] = class317.field4325[var4 + 1];
                           class582.field8568[var4] = class582.field8568[var4 + 1];
                           class624.field9182[var4] = class624.field9182[var4 + 1];
                           class165.field2331[var4] = class165.field2331[var4 + 1];
                           var7 = var4 + 1;
                        }

                        while(true) {
                           while(class710.field10360 > var7) {
                              class581.field8554[var7] = class581.field8554[var7 + 1];
                              class9.field88[var7] = class9.field88[var7 - -1];
                              class317.field4325[var7] = class317.field4325[var7 + 1];
                              class582.field8568[var7] = class582.field8568[var7 + 1];
                              class624.field9182[var7] = class624.field9182[var7 + 1];
                              class165.field2331[var7] = class165.field2331[var7 + 1];
                              ++var7;
                           }

                           ++class517.field7461;
                           class414.field5972 = class768.field11318;
                           class10 var8 = class292.method2192(arg0 + -792);
                           class447 var9 = class40.method350(class358.field4880, var8.field106, true);
                           var9.field6359.method1186(class89.method783(arg0 + 8939, arg1), 0);
                           var9.field6359.method1195((byte)127, arg1);
                           var8.method55(13256, var9);
                           if (!var2) {
                              if (!var2) {
                                 break label70;
                              }

                              ++var4;
                              break;
                           }

                           ++var7;
                        }
                     }
                  } while(class710.field10360 > var4);
               }

               if (arg0 != -8938) {
                  field5384 = -103;
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field5387[5] + arg0 + ',' + (arg1 != null ? field5387[3] : field5387[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "(IIIB)Ltu;"
   )
   public final class370 method2828(int arg0, int arg1, int arg2, byte arg3) {
      try {
         if (arg3 > -88) {
            method2827(79, (String)null);
         }

         ++field5378;
         return new class370(this.field5379, arg2, arg0, arg1, this.field5374);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5387[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "(I)Luba;"
   )
   public final class457 method2829(int arg0) {
      try {
         ++field5370;
         if (arg0 != 0) {
            method2827(-5, (String)null);
         }

         return class236.method1819(12473, this.field5379);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5387[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "<init>",
      descriptor = "(IIIIB)V"
   )
   public class370(int arg0, int arg1, int arg2, int arg3, byte arg4) {
      try {
         this.field5386 = arg1;
         this.field5368 = arg2;
         this.field5379 = arg0;
         this.field5385 = arg3;
         this.field5374 = arg4;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field5387[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2830(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2831(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
