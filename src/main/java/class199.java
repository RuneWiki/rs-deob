import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class199 {
   @OriginalMember(
      owner = "client!fd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3064 = new String[]{method1756(method1755("uZB\u0004b")), method1756(method1755("uZB\u0005b")), method1756(method1755("uZB\u0007b"))};
   @OriginalMember(
      owner = "client!fd",
      name = "c",
      descriptor = "Lnaa;"
   )
   public static class113 field3063 = new class113(19, 3);
   @OriginalMember(
      owner = "client!fd",
      name = "d",
      descriptor = "I"
   )
   public static int field3061;
   @OriginalMember(
      owner = "client!fd",
      name = "a",
      descriptor = "I"
   )
   public static int field3062;
   @OriginalMember(
      owner = "client!fd",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field3060;

   @OriginalMember(
      owner = "client!fd",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1752(int arg0) {
      try {
         field3063 = null;
         field3060 = null;
         if (arg0 != -4103) {
            method1752(80);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3064[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1753(int arg0) {
      try {
         if (arg0 != -25930) {
            field3063 = null;
         }

         ++field3061;
         class659.field9850.method627(class607.field8855, class687.field10213.field495.method5210(480102311) != 1 ? -1 : class487.field7399 + 256 << 2, 0);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3064[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method1754(int arg0) {
      boolean var1 = client.field1786;

      try {
         ++field3062;
         class23 var2 = (class23)class425.field6557.method4972((byte)-84);
         if (!var1 && var2 == null) {
            if (arg0 != -27140) {
               method1754(-76);
            }
         } else {
            do {
               class660 var3 = var2.field290;
               if (var3.field9870 < class308.field4801) {
                  var2.method2477(arg0 ^ -28092);
                  var3.method4865(2048);
                  if (!var1) {
                     var2 = (class23)class425.field6557.method4975((byte)116);
                     continue;
                  }
               }

               if (class308.field4801 >= var3.field9879) {
                  var3.method4866(-108);
                  if (~var3.field9900 < -1) {
                     class795 var4 = (class795)class501.field7665.method3141((long)(var3.field9900 + -1), true);
                     if (var4 != null) {
                        class466 var5 = var4.field11592;
                        if (~var5.field1505 <= -1 && var5.field1505 < class513.field7828 * 512 && ~var5.field1494 <= -1 && ~var5.field1494 > ~(class475.field7230 * 512)) {
                           var3.method4861((byte)-3, class477.method3711(var3.field1506, var5.field1505, (byte)0, var5.field1494) - var3.field9878, var5.field1505, var5.field1494, class308.field4801);
                        }
                     }
                  }

                  if (~var3.field9900 > -1) {
                     int var6 = -var3.field9900 + -1;
                     class9 var7;
                     if (class315.field4864 != var6) {
                        var7 = class484.field7370[var6];
                        if (var1) {
                           var7 = class476.field7251;
                        }
                     } else {
                        var7 = class476.field7251;
                     }

                     if (var7 != null && var7.field1505 >= 0 && class513.field7828 * 512 > var7.field1505 && ~var7.field1494 <= -1 && ~(class475.field7230 * 512) < ~var7.field1494) {
                        var3.method4861((byte)-3, class477.method3711(var3.field1506, var7.field1505, (byte)0, var7.field1494) + -var3.field9878, var7.field1505, var7.field1494, class308.field4801);
                     }
                  }

                  var3.method4860(class359.field5557, -77);
                  class363.method2960(var3, true);
               }

               var2 = (class23)class425.field6557.method4975((byte)116);
            } while(var2 != null);

            if (arg0 != -27140) {
               method1754(-76);
            }
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field3064[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1755(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1756(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
