import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class786 {
   @OriginalMember(
      owner = "client!wfa",
      name = "i",
      descriptor = "[Lbka;"
   )
   public class396[] field11527;
   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "Ldba;"
   )
   public class187 field11525;
   @OriginalMember(
      owner = "client!wfa",
      name = "j",
      descriptor = "Ldba;"
   )
   public class187 field11531;
   @OriginalMember(
      owner = "client!wfa",
      name = "c",
      descriptor = "Ldba;"
   )
   public class187 field11533;
   @OriginalMember(
      owner = "client!wfa",
      name = "g",
      descriptor = "[Lbka;"
   )
   public class396[] field11526;
   @OriginalMember(
      owner = "client!wfa",
      name = "f",
      descriptor = "Z"
   )
   public boolean field11530;
   @OriginalMember(
      owner = "client!wfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11536 = new String[]{method5708(method5707("u\f[~\f*")), method5708(method5707("l\u001fV<")), method5708(method5707("yD\u0014~0")), method5708(method5707("u\f[~qk\u0004S$s*")), method5708(method5707("u\f[~\u000e*")), method5708(method5707("u\f[~\u000f*"))};
   @OriginalMember(
      owner = "client!wfa",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field11532 = new int[4];
   @OriginalMember(
      owner = "client!wfa",
      name = "b",
      descriptor = "F"
   )
   public static float field11528;
   @OriginalMember(
      owner = "client!wfa",
      name = "k",
      descriptor = "I"
   )
   public static int field11529;
   @OriginalMember(
      owner = "client!wfa",
      name = "d",
      descriptor = "I"
   )
   public static int field11534;
   @OriginalMember(
      owner = "client!wfa",
      name = "h",
      descriptor = "I"
   )
   public static int field11535;

   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "(ILvca;II)V"
   )
   public static final void method5704(int arg0, class365 arg1, int arg2, int arg3) {
      try {
         ++field11529;
         class476.field7237[arg0][arg2] = arg1;
         if (arg3 <= 1) {
            method5706((byte)-45);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11536[4] + arg0 + ',' + (arg1 != null ? field11536[2] : field11536[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method5705(int arg0) {
      boolean var1 = client.field1786;

      try {
         int var2 = 0;
         int var10000;
         if (var1) {
            var10000 = 0;
         } else if (var2 >= class757.field11211.length) {
            ++field11534;
            var10000 = arg0;
            if (!var1) {
               if (arg0 > -22) {
                  method5706((byte)-10);
                  return;
               }

               return;
            }
         } else {
            var10000 = 0;
         }

         while(true) {
            label93: {
               int var3 = var10000;
               int var4;
               if (var1) {
                  var4 = 0;
                  if (var1) {
                     class757.field11211[var2][var3][var4] = 0;
                     ++var4;
                  }
               } else {
                  if (~var3 <= ~class757.field11211[0].length) {
                     break label93;
                  }

                  var4 = 0;
                  if (var1) {
                     class757.field11211[var2][var3][var4] = 0;
                     ++var4;
                  }
               }

               while(true) {
                  while(var4 < class757.field11211[0][0].length) {
                     class757.field11211[var2][var3][var4] = 0;
                     ++var4;
                  }

                  if (!var1) {
                     ++var3;
                     if (~var3 <= ~class757.field11211[0].length) {
                        break;
                     }

                     var4 = 0;
                     if (var1) {
                        class757.field11211[var2][var3][var4] = 0;
                        ++var4;
                     }
                  } else {
                     ++var4;
                  }
               }
            }

            ++var2;
            if (var2 >= class757.field11211.length) {
               ++field11534;
               var10000 = arg0;
               if (!var1) {
                  if (arg0 > -22) {
                     method5706((byte)-10);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = 0;
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field11536[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5706(byte arg0) {
      try {
         field11532 = null;
         if (arg0 > -18) {
            method5706((byte)40);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11536[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "<init>",
      descriptor = "(Lc;)V"
   )
   public class786(class652 arg0) {
      boolean var2 = client.field1786;
      super();
      this.field11527 = null;
      this.field11525 = null;
      this.field11531 = null;
      this.field11533 = null;
      this.field11526 = null;

      try {
         this.field11530 = arg0.field9679;
         class180.method1637((byte)-82, arg0);
         if (this.field11530) {
            byte[] var3 = class100.method975(111, false, class425.field6572);
            this.field11533 = new class187(arg0, 6410, 128, 128, 16, var3, 6410);
            byte[] var4 = class100.method975(116, false, class733.field10930);
            this.field11525 = new class187(arg0, 6410, 128, 128, 16, var4, 6410);
            class758 var5 = arg0.field9619;
            if (var5.method5558(35632)) {
               class187 var7;
               label35: {
                  byte[] var6 = class100.method975(108, false, class475.field7225);
                  this.field11531 = new class187(arg0, 6408, 128, 128, 16);
                  var7 = new class187(arg0, 6409, 128, 128, 16, var6, 6409);
                  if (var5.method5561(var7, 2.0F, this.field11531, (byte)109)) {
                     this.field11531.method5757((byte)75);
                     if (!var2) {
                        break label35;
                     }
                  }

                  this.field11531.method5758(9728);
                  this.field11531 = null;
               }

               var7.method5758(9728);
               return;
            }
         } else {
            int var10000;
            label63: {
               this.field11527 = new class396[16];
               int var8 = 0;
               if (var2) {
                  var10000 = 32768;
               } else if (var8 >= 16) {
                  this.field11526 = new class396[16];
                  var10000 = 0;
                  if (!var2) {
                     break label63;
                  }
               } else {
                  var10000 = 32768;
               }

               while(true) {
                  byte[] var9 = class257.method2168(var10000, var8 * 128 * 2 * 128, false, class425.field6572);
                  this.field11527[var8] = new class396(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
                  ++var8;
                  if (var8 >= 16) {
                     this.field11526 = new class396[16];
                     var10000 = 0;
                     if (!var2) {
                        break;
                     }
                  } else {
                     var10000 = 32768;
                  }
               }
            }

            int var10 = var10000;
            if (var2 || ~var10 > -17) {
               do {
                  byte[] var11 = class257.method2168(32768, var10 * 256 * 128, false, class733.field10930);
                  this.field11526[var10] = new class396(arg0, 3553, 6410, 128, 128, true, var11, 6410, false);
                  ++var10;
               } while(~var10 > -17);
            }
         }

      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field11536[3] + (arg0 != null ? field11536[2] : field11536[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5707(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5708(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
