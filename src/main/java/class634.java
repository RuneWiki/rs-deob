import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class634 {
   @OriginalMember(
      owner = "client!ll",
      name = "b",
      descriptor = "I"
   )
   public int field9169 = -1;
   @OriginalMember(
      owner = "client!ll",
      name = "m",
      descriptor = "Z"
   )
   public boolean field9171 = true;
   @OriginalMember(
      owner = "client!ll",
      name = "k",
      descriptor = "I"
   )
   public int field9167 = -1;
   @OriginalMember(
      owner = "client!ll",
      name = "d",
      descriptor = "I"
   )
   public int field9168 = 512;
   @OriginalMember(
      owner = "client!ll",
      name = "i",
      descriptor = "I"
   )
   public int field9180 = 0;
   @OriginalMember(
      owner = "client!ll",
      name = "j",
      descriptor = "I"
   )
   public int field9172 = 64;
   @OriginalMember(
      owner = "client!ll",
      name = "o",
      descriptor = "I"
   )
   public int field9175 = 127;
   @OriginalMember(
      owner = "client!ll",
      name = "q",
      descriptor = "I"
   )
   public int field9170 = 8;
   @OriginalMember(
      owner = "client!ll",
      name = "s",
      descriptor = "Z"
   )
   public boolean field9179 = true;
   @OriginalMember(
      owner = "client!ll",
      name = "g",
      descriptor = "Z"
   )
   public boolean field9174 = false;
   @OriginalMember(
      owner = "client!ll",
      name = "n",
      descriptor = "I"
   )
   public int field9184 = 1190717;
   @OriginalMember(
      owner = "client!ll",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9185 = new String[]{method4638(method4637("vr:\ri")), method4638(method4637("tkx\"")), method4638(method4637("a0:`<")), method4638(method4637("vr:\ni")), method4638(method4637("vr:\fi")), method4638(method4637("vr:\u000fi"))};
   @OriginalMember(
      owner = "client!ll",
      name = "f",
      descriptor = "[[I"
   )
   public static int[][] field9178 = new int[][]{{0, 1, 2, 3}, {1, 2, 3, 0}, {1, 2, -1, 0}, {2, 0, -1, 1}, {0, 1, -1, 2}, {1, 2, -1, 0}, {-1, 4, -1, 1}, {-1, 1, 3, -1}, {-1, 0, 2, -1}, {3, 5, 2, 0}, {0, 2, 5, 3}, {0, 2, 3, 5}, {0, 1, 2, 3}};
   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "I"
   )
   public static int field9166;
   @OriginalMember(
      owner = "client!ll",
      name = "l",
      descriptor = "I"
   )
   public static int field9173;
   @OriginalMember(
      owner = "client!ll",
      name = "r",
      descriptor = "I"
   )
   public static int field9177;
   @OriginalMember(
      owner = "client!ll",
      name = "c",
      descriptor = "I"
   )
   public static int field9181;
   @OriginalMember(
      owner = "client!ll",
      name = "p",
      descriptor = "I"
   )
   public int field9182;
   @OriginalMember(
      owner = "client!ll",
      name = "e",
      descriptor = "Lum;"
   )
   public class731 field9176;
   @OriginalMember(
      owner = "client!ll",
      name = "h",
      descriptor = "[Ljq;"
   )
   public static class672[] field9183;

   @OriginalMember(
      owner = "client!ll",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4633(int arg0) {
      try {
         field9183 = null;
         field9178 = null;
         if (arg0 != 3) {
            field9181 = 2;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9185[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method4634(int arg0) {
      try {
         this.field9170 = this.field9182 | this.field9170 << 8;
         if (arg0 <= -106) {
            ++field9173;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9185[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(ILica;B)V"
   )
   private final void method4635(int arg0, class354 arg1, byte arg2) {
      try {
         ++field9166;
         if (arg2 != -88) {
            this.method4634(-96);
         }

         if (arg0 != 1) {
            if (~arg0 != -3) {
               if (~arg0 != -4) {
                  if (arg0 == 5) {
                     this.field9171 = false;
                     return;
                  }

                  if (arg0 == 7) {
                     this.field9169 = class324.method2649(arg1.method2872(2), false);
                     return;
                  }

                  if (~arg0 == -9) {
                     this.field9176.field10915 = this.field9182;
                     return;
                  }

                  if (~arg0 != -10) {
                     if (~arg0 == -11) {
                        this.field9179 = false;
                        return;
                     }

                     if (~arg0 != -12) {
                        if (arg0 != 12) {
                           if (~arg0 != -14) {
                              if (arg0 != 14) {
                                 if (arg0 == 16) {
                                    this.field9175 = arg1.method2855(-31007);
                                    return;
                                 }
                              } else {
                                 this.field9172 = arg1.method2855(-31007) << 2;
                              }

                              return;
                           }

                           this.field9184 = arg1.method2872(2);
                           return;
                        }

                        this.field9174 = true;
                        return;
                     }

                     this.field9170 = arg1.method2855(-31007);
                     return;
                  }

                  this.field9168 = arg1.method2848(arg2 + -19) << 2;
                  return;
               }

               this.field9167 = arg1.method2848(-105);
               if (this.field9167 == 65535) {
                  this.field9167 = -1;
                  return;
               }
            } else {
               this.field9167 = arg1.method2855(-31007);
            }

         } else {
            this.field9180 = class324.method2649(arg1.method2872(arg2 ^ -86), false);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9185[3] + arg0 + ',' + (arg1 != null ? field9185[2] : field9185[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(Lica;I)V"
   )
   public final void method4636(class354 arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field9177;

         while(true) {
            int var4 = arg0.method2855(arg1 + -31007);
            if (var4 != 0) {
               this.method4635(var4, arg0, (byte)-88);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg1 != 0) {
               this.method4634(27);
               return;
            }
            break;
         }

      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9185[5] + (arg0 != null ? field9185[2] : field9185[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4637(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 65);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ll",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4638(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 26;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 78;
            break;
         default:
            var10005 = 65;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
