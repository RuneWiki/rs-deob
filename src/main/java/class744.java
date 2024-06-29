import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class744 extends class120 {
   @OriginalMember(
      owner = "client!tba",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11058 = new String[]{method5472(method5471("G3;P\u001a\u001b")), method5472(method5471("G3;P\u001e\u001b")), method5472(method5471("G3;P\u001b\u001b")), method5472(method5471("G3;P\u001d\u001b")), method5472(method5471("G3;P\u001c\u001b")), method5472(method5471("G3;P\u0019\u001b")), method5472(method5471("H\u007ftP%")), method5472(method5471("G3;P\u001f\u001b")), method5472(method5471("]$6\u0012"))};
   @OriginalMember(
      owner = "client!tba",
      name = "B",
      descriptor = "[I"
   )
   public static int[] field11051 = new int[2048];
   @OriginalMember(
      owner = "client!tba",
      name = "w",
      descriptor = "I"
   )
   public static int field11052;
   @OriginalMember(
      owner = "client!tba",
      name = "A",
      descriptor = "I"
   )
   public static int field11053;
   @OriginalMember(
      owner = "client!tba",
      name = "C",
      descriptor = "I"
   )
   public static int field11054;
   @OriginalMember(
      owner = "client!tba",
      name = "x",
      descriptor = "I"
   )
   public static int field11055;
   @OriginalMember(
      owner = "client!tba",
      name = "z",
      descriptor = "I"
   )
   public static int field11056;
   @OriginalMember(
      owner = "client!tba",
      name = "y",
      descriptor = "I"
   )
   public static int field11057;

   @OriginalMember(
      owner = "client!tba",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method5466(int arg0) {
      try {
         ++field11057;
         class603.field8813.method2551(true);
         class630.field9118.method2551(true);
         class58.field722.method2551(true);
         class361.field5595.method2551(true);
         if (arg0 != -1) {
            method5467((byte)43);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11058[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tba",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method5467(byte arg0) {
      try {
         if (arg0 != 72) {
            method5468(-37, -30, -20, 110);
         }

         field11051 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11058[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tba",
      name = "b",
      descriptor = "(IIII)V"
   )
   public static final void method5468(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field11056;
         if (arg3 != 2048) {
            field11051 = null;
         }

         class365 var4 = class476.field7237[arg2][arg1];
         class589.method4397(var4 != null ? var4 : class314.field4858, arg0, 7675);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field11058[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tba",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class744(OggStreamState arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "(Ljagtheora/ogg/OggPacket;I)V"
   )
   public final void method1113(OggPacket arg0, int arg1) {
      try {
         ++field11052;
         if (arg1 <= 53) {
            this.method1109(53);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11058[7] + (arg0 != null ? field11058[6] : field11058[8]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "(BZ)V"
   )
   public static final void method5469(byte arg0, boolean arg1) {
      boolean var2 = client.field1786;

      try {
         int var3 = -36 / ((-13 - arg0) / 45);
         ++field11053;
         if (arg1) {
            if (class288.field4539 != -1) {
               class558.method4220(true, class288.field4539);
            }

            int var10000;
            label56: {
               class276 var4 = (class276)class507.field7766.method3139(-103);
               if (var2) {
                  var10000 = var4.method2478(1001);
               } else if (var4 == null) {
                  class288.field4539 = -1;
                  class507.field7766 = new class389(8);
                  class502.method3890((byte)119);
                  class288.field4539 = class441.field6789;
                  class714.method5291(true, false);
                  class204.method1782((byte)7);
                  var10000 = class288.field4539;
                  if (!var2) {
                     break label56;
                  }
               } else {
                  var10000 = var4.method2478(1001);
               }

               label55:
               do {
                  while(true) {
                     if (var10000 == 0) {
                        var4 = (class276)class507.field7766.method3139(-72);
                        if (var4 == null) {
                           if (!var2) {
                              class288.field4539 = -1;
                              class507.field7766 = new class389(8);
                              class502.method3890((byte)119);
                              class288.field4539 = class441.field6789;
                              class714.method5291(true, false);
                              class204.method1782((byte)7);
                              var10000 = class288.field4539;
                              break;
                           }

                           class741.method5443(-1, var4, false, true);
                           var4 = (class276)class507.field7766.method3147(-21068);
                        } else {
                           class741.method5443(-1, var4, false, true);
                           var4 = (class276)class507.field7766.method3147(-21068);
                        }
                     } else {
                        class741.method5443(-1, var4, false, true);
                        var4 = (class276)class507.field7766.method3147(-21068);
                     }

                     if (var4 == null) {
                        class288.field4539 = -1;
                        class507.field7766 = new class389(8);
                        class502.method3890((byte)119);
                        class288.field4539 = class441.field6789;
                        class714.method5291(true, false);
                        class204.method1782((byte)7);
                        var10000 = class288.field4539;
                        if (!var2) {
                           break label55;
                        }
                     } else {
                        var10000 = var4.method2478(1001);
                     }
                  }
               } while(var2);
            }

            class469.method3639(var10000);
         }

         class686.field10207 = true;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field11058[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tba",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1109(int arg0) {
      try {
         if (arg0 <= 83) {
            this.method1113((OggPacket)null, -37);
         }

         ++field11054;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11058[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "(IIBIII)V"
   )
   public static final void method5470(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
      try {
         ++field11055;
         if (arg2 == 60) {
            if (~arg0 == ~arg1) {
               class285.method2381((byte)62, arg3, arg1, arg4, arg5);
            } else if (~(-arg1 + arg4) <= ~class443.field6806 && ~(arg1 + arg4) >= ~class182.field2833 && -arg0 + arg5 >= class368.field5724 && class84.field1212 >= arg0 + arg5) {
               class793.method5734(82, arg4, arg5, arg3, arg1, arg0);
            } else {
               class429.method3393(arg4, arg0, arg1, arg3, arg5, 1529412898);
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field11058[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5471(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5472(char[] arg0) {
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
            var10005 = 81;
            break;
         case 2:
            var10005 = 90;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
