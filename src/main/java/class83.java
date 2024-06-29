import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class83 extends class446 {
   @OriginalMember(
      owner = "client!mn",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1201 = new String[]{method812(method811("\u001f%$\u000b")), method812(method811("\u001c>f&\u0007")), method812(method811("\n~fIR")), method812(method811("\u001c>f%\u0007")), method812(method811("\u001c>f.\u0007")), method812(method811("\u001c>f$\u0007")), method812(method811("\u001c>f/\u0007")), method812(method811("]p")), method812(method811("Q\u0017\u00053")), method812(method811("\u001c>f-\u0007"))};
   @OriginalMember(
      owner = "client!mn",
      name = "w",
      descriptor = "[I"
   )
   public static int[] field1194 = new int[16384];
   @OriginalMember(
      owner = "client!mn",
      name = "A",
      descriptor = "[I"
   )
   public static int[] field1196 = new int[16384];
   @OriginalMember(
      owner = "client!mn",
      name = "v",
      descriptor = "[I"
   )
   public static int[] field1200;
   @OriginalMember(
      owner = "client!mn",
      name = "r",
      descriptor = "B"
   )
   private byte field1189;
   @OriginalMember(
      owner = "client!mn",
      name = "s",
      descriptor = "B"
   )
   private byte field1192;
   @OriginalMember(
      owner = "client!mn",
      name = "C",
      descriptor = "I"
   )
   public static int field1190;
   @OriginalMember(
      owner = "client!mn",
      name = "y",
      descriptor = "I"
   )
   public static int field1193;
   @OriginalMember(
      owner = "client!mn",
      name = "u",
      descriptor = "I"
   )
   public static int field1195;
   @OriginalMember(
      owner = "client!mn",
      name = "t",
      descriptor = "I"
   )
   public static int field1197;
   @OriginalMember(
      owner = "client!mn",
      name = "z",
      descriptor = "I"
   )
   public static int field1198;
   @OriginalMember(
      owner = "client!mn",
      name = "x",
      descriptor = "I"
   )
   public static int field1199;
   @OriginalMember(
      owner = "client!mn",
      name = "B",
      descriptor = "Ljava/lang/String;"
   )
   private String field1191;

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; ~var2 > -16385; ++var2) {
         field1196[var2] = (int)(16384.0D * Math.sin((double)var2 * var0));
         field1194[var2] = (int)(Math.cos((double)var2 * var0) * 16384.0D);
      }

      field1200 = new int[8];
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(Lica;I)V",
      line = 3
   )
   public final void method805(class354 arg0, int arg1) {
      try {
         this.field1191 = arg0.method2876(112);
         ++field1190;
         if (arg1 != 0) {
            field1194 = null;
         }

         if (this.field1191 != null) {
            arg0.method2855(-31007);
            this.field1192 = arg0.method2886((byte)88);
            this.field1189 = arg0.method2886((byte)88);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1201[1] + (arg0 != null ? field1201[2] : field1201[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(BC)Z",
      line = 26
   )
   public static final boolean method806(byte arg0, char arg1) {
      boolean var2 = client.field1786;

      try {
         ++field1198;
         if (arg0 >= -52) {
            return false;
         } else if (Character.isISOControl(arg1)) {
            return false;
         } else if (class11.method88(arg1, 0)) {
            return true;
         } else {
            char[] var3 = class14.field182;
            int var4 = 0;
            char var5;
            if (var2) {
               var5 = var3[var4];
               if (arg1 == var5) {
                  return true;
               }

               ++var4;
            }

            while(true) {
               char var10000;
               if (~var3.length >= ~var4) {
                  char[] var6 = class437.field6697;
                  var10000 = 0;
                  if (!var2) {
                     int var7 = 0;
                     char var8;
                     if (var2) {
                        var8 = var6[var7];
                        if (~arg1 == ~var8) {
                           return true;
                        }

                        ++var7;
                     }

                     while(true) {
                        if (~var6.length >= ~var7) {
                           var10000 = 0;
                           if (!var2) {
                              return false;
                           }
                        } else {
                           var10000 = var6[var7];
                        }

                        var8 = var10000;
                        if (~arg1 == ~var8) {
                           return true;
                        }

                        ++var7;
                     }
                  }
               } else {
                  var10000 = var3[var4];
               }

               var5 = var10000;
               if (arg1 == var5) {
                  return true;
               }

               ++var4;
            }
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field1201[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(I)V",
      line = 69
   )
   public static void method807(int arg0) {
      try {
         field1200 = null;
         field1194 = null;
         if (arg0 != 10) {
            method806((byte)-56, '\u000e');
         }

         field1196 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1201[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(IB)V",
      line = 89
   )
   public static final void method808(int arg0, byte arg1) {
      try {
         if (arg1 <= -39) {
            ++field1193;
            class566 var2 = class146.method1321((long)arg0, 3, -1428737160);
            var2.method4268(4);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1201[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(JB)Ljava/lang/String;",
      line = 104
   )
   public static final String method809(long arg0, byte arg1) {
      try {
         class81.field1151.setTime(new Date(arg0));
         ++field1197;
         int var3 = class81.field1151.get(7);
         int var4 = class81.field1151.get(5);
         int var5 = class81.field1151.get(2);
         int var6 = class81.field1151.get(1);
         int var7 = class81.field1151.get(11);
         int var8 = class81.field1151.get(12);
         int var9 = class81.field1151.get(13);
         if (arg1 <= 4) {
            method806((byte)-83, 'M');
         }

         return class278.field4454[var3 + -1] + field1201[7] + var4 / 10 + var4 % 10 + "-" + class621.field9038[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + field1201[8];
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field1201[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(ILaka;)V",
      line = 139
   )
   public final void method810(int arg0, class637 arg1) {
      try {
         ++field1195;
         if (this.field1191 != null) {
            arg1.field9234 = this.field1192;
            arg1.field9229 = this.field1189;
         }

         arg1.field9227 = this.field1191;
         if (arg0 != 32061) {
            method809(91L, (byte)24);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1201[5] + arg0 + ',' + (arg1 != null ? field1201[2] : field1201[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method811(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method812(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 113;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
