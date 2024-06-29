import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public class class282 {
   @OriginalMember(
      owner = "client!gia",
      name = "e",
      descriptor = "Ldw;"
   )
   private class748 field3919 = new class748(128);
   @OriginalMember(
      owner = "client!gia",
      name = "b",
      descriptor = "Leaa;"
   )
   private class526 field3920;
   @OriginalMember(
      owner = "client!gia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3924 = new String[]{method2157(method2156("V\u0001n1\u0006\u0019")), method2157(method2156("V\u0001n1\u0005\u0019")), method2157(method2156("_\u001dcs")), method2157(method2156("JF!1:")), method2157(method2156("V\u0001n1{X\u0006fky\u0019"))};
   @OriginalMember(
      owner = "client!gia",
      name = "c",
      descriptor = "I"
   )
   public static int field3921;
   @OriginalMember(
      owner = "client!gia",
      name = "d",
      descriptor = "I"
   )
   public static int field3922;
   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "I"
   )
   public static int field3923;

   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "(BI)Lkea;",
      line = 7
   )
   public final class248 method2154(byte arg0, int arg1) {
      try {
         ++field3922;
         class748 var3 = this.field3919;
         class248 var4;
         synchronized(this.field3919) {
            var4 = (class248)this.field3919.method5454((long)arg1, 18261);
         }

         if (var4 != null) {
            return var4;
         } else {
            byte[] var5 = this.field3920.method3899(-58, class263.method1997(arg1, arg0 ^ -11696), class199.method1519(2, arg1));
            if (arg0 != -76) {
               return null;
            } else {
               class248 var6 = new class248();
               if (var5 != null) {
                  var6.method1871(new class128(var5), 57);
               }

               class748 var7 = this.field3919;
               synchronized(this.field3919) {
                  this.field3919.method5455(-2049, var6, (long)arg1);
                  return var6;
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field3924[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "(II)V",
      line = 41
   )
   public static final void method2155(int arg0, int arg1) {
      try {
         ++field3923;
         int var2 = class314.field4488 - class428.field6544;
         if (~var2 <= -101) {
            class387.field5919 = -1;
            class57.field717 = -1;
            class675.field10142 = 1;
         } else {
            int var3 = (int)class317.field4533;
            if (var3 < class781.field11398 >> 8) {
               var3 = class781.field11398 >> 8;
            }

            if (class258.field3498[4] && var3 < class368.field5539[4] + 128) {
               var3 = class368.field5539[4] - -128;
            }

            float var5;
            int var6;
            label31: {
               int var4 = 16383 & (int)class56.field706 + class231.field2937;
               class442.method3345(-200 + class368.method2858(class693.field10418.field9007, (byte)-11, class693.field10418.field9003, class551.field8158), var4, var3, class573.field8527, arg0, 600 - -((var3 >> 3) * 3) << 2, (byte)56, class747.field11068);
               var5 = (float)arg1 + -((float)((100 - var2) * (-var2 + 100) * (-var2 + 100)) / 1000000.0F);
               class733.field10871 = (int)((float)(class733.field10871 - class703.field10542) * var5 + (float)class703.field10542);
               class713.field10637 = (int)((float)(-class741.field10999 + class713.field10637) * var5 + (float)class741.field10999);
               class232.field2947 = (int)((float)(-class778.field11360 + class232.field2947) * var5 + (float)class778.field11360);
               class731.field10844 = (int)((float)(-class366.field5507 + class731.field10844) * var5 + (float)class366.field5507);
               var6 = -class767.field11253 + class292.field4078;
               if (~var6 >= -8193) {
                  if (~var6 <= 8191) {
                     break label31;
                  }

                  var6 += 16384;
                  if (client.field4530 == 0) {
                     break label31;
                  }
               }

               var6 -= 16384;
            }

            class292.field4078 = (int)((float)var6 * var5 + (float)class767.field11253);
            class292.field4078 &= 16383;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field3924[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "<init>",
      descriptor = "(Lqo;ILeaa;)V",
      line = 92
   )
   public class282(class24 arg0, int arg1, class526 arg2) {
      try {
         this.field3920 = arg2;
         if (this.field3920 != null) {
            int var4 = -1 + this.field3920.method3903((byte)95);
            this.field3920.method3875(0, var4);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field3924[4] + (arg0 != null ? field3924[3] : field3924[2]) + ',' + arg1 + ',' + (arg2 != null ? field3924[3] : field3924[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2156(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2157(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
