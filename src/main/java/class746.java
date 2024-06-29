import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class746 extends class604 {
   @OriginalMember(
      owner = "client!nea",
      name = "r",
      descriptor = "I"
   )
   private int field10845;
   @OriginalMember(
      owner = "client!nea",
      name = "s",
      descriptor = "I"
   )
   private int field10847;
   @OriginalMember(
      owner = "client!nea",
      name = "q",
      descriptor = "I"
   )
   private int field10843;
   @OriginalMember(
      owner = "client!nea",
      name = "p",
      descriptor = "I"
   )
   private int field10848;
   @OriginalMember(
      owner = "client!nea",
      name = "t",
      descriptor = "I"
   )
   private int field10849;
   @OriginalMember(
      owner = "client!nea",
      name = "n",
      descriptor = "Lor;"
   )
   private class670 field10844;
   @OriginalMember(
      owner = "client!nea",
      name = "l",
      descriptor = "I"
   )
   private int field10841;
   @OriginalMember(
      owner = "client!nea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10851 = new String[]{method5391(method5390("?|}g")), method5391(method5390("*'?%!")), method5391(method5390("?lp%`8gx\u007fby")), method5391(method5390("?lp%\u001by")), method5391(method5390("?lp%\u001ay"))};
   @OriginalMember(
      owner = "client!nea",
      name = "u",
      descriptor = "Lod;"
   )
   public static class536 field10840 = new class536();
   @OriginalMember(
      owner = "client!nea",
      name = "o",
      descriptor = "I"
   )
   public static int field10846;
   @OriginalMember(
      owner = "client!nea",
      name = "k",
      descriptor = "I"
   )
   public static int field10850;
   @OriginalMember(
      owner = "client!nea",
      name = "m",
      descriptor = "Lfh;"
   )
   private class681 field10842;

   @OriginalMember(
      owner = "client!nea",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5389(byte arg0) {
      try {
         field10840 = null;
         int var1 = -91 % ((4 - arg0) / 49);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10851[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nea",
      name = "<init>",
      descriptor = "(Lor;IIIIII)V"
   )
   public class746(class670 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         this.field10845 = arg4;
         this.field10847 = arg2;
         this.field10843 = arg3;
         this.field10848 = arg5;
         this.field10849 = arg1;
         this.field10844 = arg0;
         this.field10841 = arg6;
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field10851[2] + (arg0 != null ? field10851[1] : field10851[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nea",
      name = "c",
      descriptor = "(I)Lfh;"
   )
   public final class681 method1910(int arg0) {
      boolean var2 = client.field4273;

      try {
         if (arg0 != 52) {
            this.method1910(11);
         }

         ++field10846;
         if (this.field10842 == null) {
            class160 var3;
            byte var4;
            int var5;
            int var9;
            label88: {
               class472.field6545[4] = this.field10848;
               var3 = this.field10844.field726;
               class472.field6545[2] = this.field10843;
               class472.field6545[5] = this.field10841;
               class472.field6545[1] = this.field10847;
               class472.field6545[3] = this.field10845;
               class472.field6545[0] = this.field10849;
               var4 = 0;
               var5 = 0;
               int var6 = 0;
               if (var2) {
                  if (!var3.method1289((byte)-53, class472.field6545[var6])) {
                     return null;
                  }
               } else if (~var6 <= -7) {
                  var9 = 0;
                  if (!var2) {
                     break label88;
                  }
               } else if (!var3.method1289((byte)-53, class472.field6545[var6])) {
                  return null;
               }

               while(true) {
                  class359 var7 = var3.method1293(class472.field6545[var6], -5150);
                  int var8 = var7.field5116 ? 64 : 128;
                  if (var7.field5106 > 0) {
                     var4 = 1;
                  }

                  if (~var8 < ~var5) {
                     var5 = var8;
                  }

                  ++var6;
                  if (~var6 <= -7) {
                     var9 = 0;
                     if (!var2) {
                        break;
                     }
                  } else if (!var3.method1289((byte)-53, class472.field6545[var6])) {
                     return null;
                  }
               }
            }

            if (var2) {
               class795.field11618[var9] = var3.method1292(var5, false, (byte)124, 1.0F, var5, class472.field6545[var9]);
               ++var9;
            }

            while(true) {
               while(~var9 > -7) {
                  class795.field11618[var9] = var3.method1292(var5, false, (byte)124, 1.0F, var5, class472.field6545[var9]);
                  ++var9;
               }

               if (!var2) {
                  this.field10842 = new class681(this.field10844, 6407, var5, ~var4 != -1, class795.field11618);
                  break;
               }

               ++var9;
            }
         }

         return this.field10842;
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field10851[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5390(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5391(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 81;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
