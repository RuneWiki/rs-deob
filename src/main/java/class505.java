import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class505 {
   @OriginalMember(
      owner = "client!qq",
      name = "b",
      descriptor = "Ltv;"
   )
   private class590 field6915 = new class590(64);
   @OriginalMember(
      owner = "client!qq",
      name = "h",
      descriptor = "Lqh;"
   )
   private class74 field6916;
   @OriginalMember(
      owner = "client!qq",
      name = "i",
      descriptor = "Lqh;"
   )
   private class74 field6917;
   @OriginalMember(
      owner = "client!qq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6923 = new String[]{method3647(method3646("T\u0017\u001e\u0016[")), method3647(method3646("^H\u001e\u0004OAPD\u0006\u000e")), method3647(method3646("AL\\T")), method3647(method3646("^H\u001e{\u000e")), method3647(method3646("^H\u001ey\u000e")), method3647(method3646("^H\u001ez\u000e"))};
   @OriginalMember(
      owner = "client!qq",
      name = "d",
      descriptor = "Lnw;"
   )
   public static class616 field6918 = new class616(61, 16);
   @OriginalMember(
      owner = "client!qq",
      name = "g",
      descriptor = "Lw;"
   )
   public static class317 field6920 = new class317();
   @OriginalMember(
      owner = "client!qq",
      name = "a",
      descriptor = "I"
   )
   public static int field6921 = 0;
   @OriginalMember(
      owner = "client!qq",
      name = "e",
      descriptor = "I"
   )
   public static int field6914;
   @OriginalMember(
      owner = "client!qq",
      name = "c",
      descriptor = "I"
   )
   public static int field6919;
   @OriginalMember(
      owner = "client!qq",
      name = "f",
      descriptor = "[[[Z"
   )
   public static boolean[][][] field6922;

   @OriginalMember(
      owner = "client!qq",
      name = "a",
      descriptor = "(IB)Ltl;"
   )
   public final class651 method3643(int arg0, byte arg1) {
      try {
         ++field6919;
         if (arg1 <= 50) {
            return null;
         } else {
            class651 var3 = (class651)this.field6915.method4239((long)arg0, 0);
            if (var3 != null) {
               return var3;
            } else {
               byte[] var4;
               label27: {
                  if (arg0 >= 32768) {
                     var4 = this.field6916.method732(32767 & arg0, 0, (byte)37);
                     if (!client.field4273) {
                        break label27;
                     }
                  }

                  var4 = this.field6917.method732(arg0, 0, (byte)55);
               }

               class651 var5 = new class651();
               if (var4 != null) {
                  var5.method4715(new class594(var4), true);
               }

               if (~arg0 <= -32769) {
                  var5.method4714(32768);
               }

               this.field6915.method4238(52, var5, (long)arg0);
               return var5;
            }
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field6923[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3644(int arg0) {
      try {
         if (arg0 == -6516) {
            field6918 = null;
            field6922 = null;
            field6920 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6923[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "a",
      descriptor = "(II)Lsb;"
   )
   public static final class307 method3645(int arg0, int arg1) {
      try {
         ++field6914;
         class307 var2 = (class307)class60.field642.method4239((long)arg1, 0);
         if (var2 != null) {
            return var2;
         } else if (arg0 > -88) {
            return null;
         } else {
            byte[] var3 = class204.field2512.method732(arg1, 1, (byte)59);
            class307 var4 = new class307();
            var4.field4080 = arg1;
            if (var3 != null) {
               var4.method2311(new class594(var3), false);
            }

            var4.method2307(0);
            if (var4.field4089 == 2 && class306.field4065.method1839(19, (long)arg1) == null) {
               class306.field4065.method1841((long)arg1, true, new class144(class76.field964));
               class483.field6661[class76.field964++] = var4;
            }

            class60.field642.method4238(84, var4, (long)arg1);
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field6923[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "<init>",
      descriptor = "(ILqh;Lqh;)V"
   )
   public class505(int arg0, class74 arg1, class74 arg2) {
      try {
         this.field6916 = arg2;
         this.field6917 = arg1;
         if (this.field6917 != null) {
            this.field6917.method727(0, -32767);
         }

         if (this.field6916 != null) {
            this.field6916.method727(0, -32767);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6923[1] + arg0 + ',' + (arg1 != null ? field6923[0] : field6923[2]) + ',' + (arg2 != null ? field6923[0] : field6923[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3646(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3647(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 57;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
