import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class19 {
   @OriginalMember(
      owner = "client!eh",
      name = "e",
      descriptor = "I"
   )
   public int field240;
   @OriginalMember(
      owner = "client!eh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field246 = new String[]{method146(method145("b\u0015\u0014y")), method146(method145("wNV;o")), method146(method145("i\bVT:")), method146(method145("i\bV){b\t\f+:")), method146(method145("i\bVa}_\u0014\n||kH")), method146(method145("i\bVV:"))};
   @OriginalMember(
      owner = "client!eh",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field243 = new int[13];
   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "I"
   )
   public static int field242;
   @OriginalMember(
      owner = "client!eh",
      name = "f",
      descriptor = "I"
   )
   public static int field245;
   @OriginalMember(
      owner = "client!eh",
      name = "b",
      descriptor = "J"
   )
   public static long field244;
   @OriginalMember(
      owner = "client!eh",
      name = "d",
      descriptor = "[Lbaa;"
   )
   public static class109[] field241;

   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method142(boolean arg0) {
      if (arg0) {
         class711.field10694 = class459.field7006;
         class385.field6076 = class190.field2949;
      } else {
         class711.field10694 = class459.field7003;
         class385.field6076 = class96.field1355;
      }

      class461.field7016 = class711.field10694.length;
   }

   @OriginalMember(
      owner = "client!eh",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field242;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field246[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "(II[Lfq;)V"
   )
   public static final void method143(int arg0, int arg1, class374[] arg2) {
      boolean var3 = client.field1786;

      try {
         ++field245;
         int var4 = 0;
         if (arg0 == -1) {
            while(arg2.length > var4) {
               class374 var5 = arg2[var4];
               if (var5 != null) {
                  if (~var5.field5910 == -1) {
                     if (var5.field5829 != null) {
                        method143(-1, arg1, var5.field5829);
                     }

                     class276 var6 = (class276)class507.field7766.method3141((long)var5.field5840, true);
                     if (var6 != null) {
                        class271.method2314((byte)-108, arg1, var6.field4404);
                     }
                  }

                  if (~arg1 == -1 && var5.field5818 != null) {
                     class36 var7 = new class36();
                     var7.field441 = var5;
                     var7.field437 = var5.field5818;
                     class469.method3632(var7);
                  }

                  if (~arg1 == -2 && var5.field5813 != null) {
                     label85: {
                        if (~var5.field5848 <= -1) {
                           class374 var8 = class183.method1658(var5.field5840, arg0 ^ -114);
                           if (var8 == null || var8.field5789 == null || ~var8.field5789.length >= ~var5.field5848 || var8.field5789[var5.field5848] != var5 && !var3) {
                              break label85;
                           }
                        }

                        class36 var9 = new class36();
                        var9.field441 = var5;
                        var9.field437 = var5.field5813;
                        class469.method3632(var9);
                     }
                  }
               }

               ++var4;
            }

         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field246[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field246[1] : field246[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class19(int arg0) {
      try {
         this.field240 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field246[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method144(int arg0) {
      try {
         field243 = null;
         field241 = null;
         if (arg0 > -31) {
            field243 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field246[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method145(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method146(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
