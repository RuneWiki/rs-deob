import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class757 {
   @OriginalMember(
      owner = "client!pea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11221 = new String[]{method5502(method5501(",\u0004q<wt")), method5502(method5501("2\u0014|~")), method5502(method5501("'O><L")), method5502(method5501(",\u0004q<st")), method5502(method5501(",\u0004q<ut")), method5502(method5501(",\u0004q<pt")), method5502(method5501(",\u0004q<rt")), method5502(method5501(",\u0004q<tt"))};
   @OriginalMember(
      owner = "client!pea",
      name = "b",
      descriptor = "Ljava/util/Calendar;"
   )
   public static Calendar field11217 = Calendar.getInstance(TimeZone.getTimeZone(method5502(method5501("\u001b,D"))));
   @OriginalMember(
      owner = "client!pea",
      name = "j",
      descriptor = "C"
   )
   public char field11216;
   @OriginalMember(
      owner = "client!pea",
      name = "d",
      descriptor = "I"
   )
   public static int field11210;
   @OriginalMember(
      owner = "client!pea",
      name = "a",
      descriptor = "I"
   )
   public int field11211;
   @OriginalMember(
      owner = "client!pea",
      name = "f",
      descriptor = "I"
   )
   public static int field11212;
   @OriginalMember(
      owner = "client!pea",
      name = "c",
      descriptor = "I"
   )
   public static int field11213;
   @OriginalMember(
      owner = "client!pea",
      name = "h",
      descriptor = "I"
   )
   public int field11214;
   @OriginalMember(
      owner = "client!pea",
      name = "i",
      descriptor = "I"
   )
   public static int field11215;
   @OriginalMember(
      owner = "client!pea",
      name = "g",
      descriptor = "I"
   )
   public int field11218;
   @OriginalMember(
      owner = "client!pea",
      name = "k",
      descriptor = "I"
   )
   public static int field11219;
   @OriginalMember(
      owner = "client!pea",
      name = "e",
      descriptor = "[Ls;"
   )
   public static class295[] field11220;

   @OriginalMember(
      owner = "client!pea",
      name = "a",
      descriptor = "(II)V",
      line = 4
   )
   public static final void method5495(int arg0, int arg1) {
      try {
         ++field11219;
         if (class196.field2771 != null) {
            if (arg0 >= 0 && ~class196.field2771.field5841 < ~arg0) {
               class578 var2 = class196.field2771.field5854[arg0];
               if (~var2.field8530 == 0) {
                  class10 var3 = class292.method2192(-9730);
                  class447 var4 = class40.method350(class50.field659, var3.field106, true);
                  var4.field6359.method1186(2 - -class89.method783(1, var2.field8532), 0);
                  if (arg1 > 118) {
                     var4.field6359.method1185(arg0, true);
                     var4.field6359.method1195((byte)124, var2.field8532);
                     var3.method55(13256, var4);
                  }
               }
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field11221[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pea",
      name = "a",
      descriptor = "(Ltp;ZZZ)V",
      line = 43
   )
   public static final void method5496(class561 param0, boolean param1, boolean param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pea",
      name = "a",
      descriptor = "(I[I[I)V",
      line = 103
   )
   public static final void method5497(int param0, int[] param1, int[] param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pea",
      name = "a",
      descriptor = "(I)V",
      line = 141
   )
   public static void method5498(int arg0) {
      try {
         field11220 = null;
         field11217 = null;
         int var1 = -53 % ((10 - arg0) / 41);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11221[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pea",
      name = "a",
      descriptor = "(ILwf;)V",
      line = 152
   )
   public final void method5499(int arg0, class147 arg1) {
      boolean var3 = client.field4360;

      try {
         while(true) {
            int var4 = arg1.method1143(arg0 + -15464);
            if (~var4 != -1) {
               this.method5500((byte)-57, arg1, var4);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg0 != -1) {
               return;
            }

            ++field11212;
            break;
         }

      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field11221[3] + arg0 + ',' + (arg1 != null ? field11221[2] : field11221[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pea",
      name = "a",
      descriptor = "(BLwf;I)V",
      line = 173
   )
   private final void method5500(byte arg0, class147 arg1, int arg2) {
      try {
         label27: {
            int var4 = -41 % ((-9 - arg0) / 46);
            if (arg2 != 1) {
               if (~arg2 != -4) {
                  break label27;
               }

               this.field11211 = arg1.method1211(-26166);
               this.field11218 = arg1.method1143(-15465);
               this.field11214 = arg1.method1143(-15465);
               if (!client.field4360) {
                  break label27;
               }
            }

            this.field11216 = class312.method2306(true, arg1.method1162(4));
         }

         ++field11210;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field11221[0] + arg0 + ',' + (arg1 != null ? field11221[2] : field11221[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5501(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5502(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 97;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
