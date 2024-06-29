import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class559 {
   @OriginalMember(
      owner = "client!ts",
      name = "h",
      descriptor = "I"
   )
   private int field8140 = 0;
   @OriginalMember(
      owner = "client!ts",
      name = "i",
      descriptor = "Lld;"
   )
   private class178 field8138;
   @OriginalMember(
      owner = "client!ts",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8144 = new String[]{method4178(method4177("G\u0003\u000e*&")), method4178(method4177("G\u0003\u000e+&")), method4178(method4177("G\u0003\u000e(&")), method4178(method4177("G\u0003\u000e-&")), method4178(method4177("]\u0005L\u0005")), method4178(method4177("G\u0003\u000eUg]\u0019TW&")), method4178(method4177("H^\u000eGs"))};
   @OriginalMember(
      owner = "client!ts",
      name = "d",
      descriptor = "[[Ljava/lang/String;"
   )
   public static String[][] field8136 = new String[][]{{method4178(method4177("~A")), method4178(method4177("~B")), method4178(method4177("`A")), "F"}, {method4178(method4177("~A")), method4178(method4177("~B")), method4178(method4177("~C")), method4178(method4177("`A")), method4178(method4177("`B")), "F"}, {method4178(method4177("~A")), method4178(method4177("~B")), method4178(method4177("~C")), method4178(method4177("~D")), method4178(method4177("`A")), method4178(method4177("`B")), method4178(method4177("`C")), "F"}};
   @OriginalMember(
      owner = "client!ts",
      name = "f",
      descriptor = "I"
   )
   public static int field8139;
   @OriginalMember(
      owner = "client!ts",
      name = "b",
      descriptor = "I"
   )
   public static int field8141;
   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "I"
   )
   public static int field8142;
   @OriginalMember(
      owner = "client!ts",
      name = "e",
      descriptor = "Lub;"
   )
   private class22 field8135;
   @OriginalMember(
      owner = "client!ts",
      name = "g",
      descriptor = "Lsm;"
   )
   public static class297 field8134;
   @OriginalMember(
      owner = "client!ts",
      name = "j",
      descriptor = "Lnn;"
   )
   public static class434 field8143;
   @OriginalMember(
      owner = "client!ts",
      name = "c",
      descriptor = "[Lvca;"
   )
   public static class294[] field8137;

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(Z)Lub;",
      line = 3
   )
   public final class22 method4173(boolean arg0) {
      boolean var2 = client.field4564;

      try {
         ++field8142;
         if (~this.field8140 < -1 && this.field8138.field2750[this.field8140 + -1] != this.field8135) {
            class22 var3 = this.field8135;
            this.field8135 = var3.field346;
            return var3;
         } else {
            class22 var10000;
            class22 var4;
            if (arg0) {
               field8137 = null;
               if (var2) {
                  var4 = this.field8138.field2750[this.field8140++].field346;
                  var10000 = var4;
               } else {
                  if (this.field8140 >= this.field8138.field2751) {
                     return null;
                  }

                  var4 = this.field8138.field2750[this.field8140++].field346;
                  var10000 = var4;
               }
            } else {
               if (this.field8140 >= this.field8138.field2751) {
                  return null;
               }

               var4 = this.field8138.field2750[this.field8140++].field346;
               var10000 = var4;
            }

            do {
               while(var10000 == this.field8138.field2750[this.field8140 + -1]) {
                  if (this.field8140 >= this.field8138.field2751) {
                     return null;
                  }

                  var4 = this.field8138.field2750[this.field8140++].field346;
                  var10000 = var4;
               }

               this.field8135 = var4.field346;
               var10000 = var4;
            } while(var2);

            return var4;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8144[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(B)V",
      line = 35
   )
   public static void method4174(byte arg0) {
      try {
         if (arg0 != 82) {
            field8134 = null;
         }

         field8137 = null;
         field8143 = null;
         field8134 = null;
         field8136 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8144[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "<init>",
      descriptor = "()V",
      line = 91
   )
   public class559() {
   }

   @OriginalMember(
      owner = "client!ts",
      name = "<init>",
      descriptor = "(Lld;)V",
      line = 93
   )
   public class559(class178 arg0) {
      try {
         this.field8138 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8144[5] + (arg0 != null ? field8144[6] : field8144[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "b",
      descriptor = "(B)Lub;",
      line = 67
   )
   public final class22 method4175(byte arg0) {
      try {
         if (arg0 != -127) {
            field8136 = null;
         }

         this.field8140 = 0;
         ++field8139;
         return this.method4173(false);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8144[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(I)Z",
      line = 81
   )
   public static final boolean method4176(int arg0) {
      try {
         ++field8141;
         if (arg0 >= -88) {
            field8134 = null;
         }

         return class103.field1686 > 0;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8144[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4177(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ts",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4178(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
