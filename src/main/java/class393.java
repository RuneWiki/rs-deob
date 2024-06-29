import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public class class393 extends class757 {
   @OriginalMember(
      owner = "client!fha",
      name = "m",
      descriptor = "I"
   )
   private int field6161;
   @OriginalMember(
      owner = "client!fha",
      name = "p",
      descriptor = "I"
   )
   private int field6170;
   @OriginalMember(
      owner = "client!fha",
      name = "u",
      descriptor = "I"
   )
   private int field6163;
   @OriginalMember(
      owner = "client!fha",
      name = "l",
      descriptor = "I"
   )
   private int field6162;
   @OriginalMember(
      owner = "client!fha",
      name = "q",
      descriptor = "I"
   )
   private int field6166;
   @OriginalMember(
      owner = "client!fha",
      name = "r",
      descriptor = "I"
   )
   private int field6169;
   @OriginalMember(
      owner = "client!fha",
      name = "n",
      descriptor = "Lmu;"
   )
   private class258 field6168;
   @OriginalMember(
      owner = "client!fha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6171 = new String[]{method3171(method3170("XXPv")), method3171(method3170("PE]4*_CUn(\u001e")), method3171(method3170("M\u0003\u00124k")), method3171(method3170("PE]4W\u001e"))};
   @OriginalMember(
      owner = "client!fha",
      name = "o",
      descriptor = "I"
   )
   public static int field6164 = 0;
   @OriginalMember(
      owner = "client!fha",
      name = "s",
      descriptor = "I"
   )
   public static int field6167;
   @OriginalMember(
      owner = "client!fha",
      name = "t",
      descriptor = "Lan;"
   )
   private class496 field6165;

   @OriginalMember(
      owner = "client!fha",
      name = "c",
      descriptor = "(I)Lan;",
      line = 17
   )
   public final class496 method3169(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field6167;
         int var3 = 109 % ((16 - arg0) / 57);
         if (this.field6165 == null) {
            class150 var4;
            byte var5;
            int var6;
            int var10;
            label85: {
               class227.field3454[3] = this.field6162;
               var4 = this.field6168.field8891;
               class227.field3454[0] = this.field6163;
               class227.field3454[2] = this.field6166;
               class227.field3454[1] = this.field6169;
               class227.field3454[4] = this.field6161;
               class227.field3454[5] = this.field6170;
               var5 = 0;
               var6 = 0;
               int var7 = 0;
               if (var2) {
                  if (!var4.method1372(-115, class227.field3454[var7])) {
                     return null;
                  }
               } else if (var7 >= 6) {
                  var10 = 0;
                  if (!var2) {
                     break label85;
                  }
               } else if (!var4.method1372(-115, class227.field3454[var7])) {
                  return null;
               }

               while(true) {
                  class453 var8 = var4.method1373(class227.field3454[var7], (byte)-54);
                  int var9 = var8.field6933 ? 64 : 128;
                  if (~var6 > ~var9) {
                     var6 = var9;
                  }

                  if (~var8.field6936 < -1) {
                     var5 = 1;
                  }

                  ++var7;
                  if (var7 >= 6) {
                     var10 = 0;
                     if (!var2) {
                        break;
                     }
                  } else if (!var4.method1372(-115, class227.field3454[var7])) {
                     return null;
                  }
               }
            }

            if (var2) {
               class465.field7068[var10] = var4.method1375(var6, 1.0F, false, var6, class227.field3454[var10], -9197);
               ++var10;
            }

            while(true) {
               while(var10 < 6) {
                  class465.field7068[var10] = var4.method1375(var6, 1.0F, false, var6, class227.field3454[var10], -9197);
                  ++var10;
               }

               if (!var2) {
                  this.field6165 = this.field6168.method1473(class465.field7068, ~var5 != -1, var6, (byte)117);
                  break;
               }

               ++var10;
            }
         }

         return this.field6165;
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field6171[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fha",
      name = "<init>",
      descriptor = "(Lmu;IIIIII)V",
      line = 75
   )
   public class393(class258 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         this.field6161 = arg5;
         this.field6170 = arg6;
         this.field6163 = arg1;
         this.field6162 = arg4;
         this.field6166 = arg3;
         this.field6169 = arg2;
         this.field6168 = arg0;
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field6171[1] + (arg0 != null ? field6171[2] : field6171[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3170(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3171(char[] arg0) {
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
            var10005 = 45;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
