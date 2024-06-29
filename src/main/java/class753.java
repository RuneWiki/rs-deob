import jaclib.memory.Buffer;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class753 extends class133 implements class390 {
   @OriginalMember(
      owner = "client!wn",
      name = "c",
      descriptor = "I"
   )
   private int field11138;
   @OriginalMember(
      owner = "client!wn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11140 = new String[]{method5485(method5484("gU\u000e\u000f")), method5485(method5484("r\u000eLM^")), method5485(method5484("~NL \u000b")), method5485(method5484("~NL!\u000b")), method5485(method5484("~NL$\u000b")), method5485(method5484("~NL+\u000b")), method5485(method5484("~NL_JgI\u0016]\u000b")), method5485(method5484("~NL\"\u000b")), method5485(method5484("~NL%\u000b")), method5485(method5484("~NL'\u000b")), method5485(method5484("~NL&\u000b"))};
   @OriginalMember(
      owner = "client!wn",
      name = "e",
      descriptor = "I"
   )
   public static int field11129 = 0;
   @OriginalMember(
      owner = "client!wn",
      name = "f",
      descriptor = "I"
   )
   public static int field11128;
   @OriginalMember(
      owner = "client!wn",
      name = "j",
      descriptor = "I"
   )
   public static int field11130;
   @OriginalMember(
      owner = "client!wn",
      name = "i",
      descriptor = "I"
   )
   public static int field11131;
   @OriginalMember(
      owner = "client!wn",
      name = "k",
      descriptor = "I"
   )
   public static int field11132;
   @OriginalMember(
      owner = "client!wn",
      name = "l",
      descriptor = "I"
   )
   public static int field11133;
   @OriginalMember(
      owner = "client!wn",
      name = "h",
      descriptor = "I"
   )
   public static int field11135;
   @OriginalMember(
      owner = "client!wn",
      name = "m",
      descriptor = "I"
   )
   public static int field11136;
   @OriginalMember(
      owner = "client!wn",
      name = "d",
      descriptor = "I"
   )
   public static int field11137;
   @OriginalMember(
      owner = "client!wn",
      name = "n",
      descriptor = "I"
   )
   public static int field11139;
   @OriginalMember(
      owner = "client!wn",
      name = "g",
      descriptor = "Ljava/lang/Thread;"
   )
   public static Thread field11134;

   @OriginalMember(
      owner = "client!wn",
      name = "b",
      descriptor = "(Z)V"
   )
   public static final void method5480(boolean arg0) {
      try {
         if (arg0) {
            field11134 = null;
         }

         class661.field9573.method5451(12);
         ++field11128;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11140[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "<init>",
      descriptor = "(Lck;I[BI)V"
   )
   public class753(class667 arg0, int arg1, byte[] arg2, int arg3) {
      super(arg0, arg2, arg3);

      try {
         this.field11138 = arg1;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field11140[6] + (arg0 != null ? field11140[1] : field11140[0]) + ',' + arg1 + ',' + (arg2 != null ? field11140[1] : field11140[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "<init>",
      descriptor = "(Lck;ILjaclib/memory/Buffer;)V"
   )
   public class753(class667 arg0, int arg1, Buffer arg2) {
      super(arg0, arg2);

      try {
         this.field11138 = arg1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field11140[6] + (arg0 != null ? field11140[1] : field11140[0]) + ',' + arg1 + ',' + (arg2 != null ? field11140[1] : field11140[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "a",
      descriptor = "(IZIIIILcka;)Z"
   )
   public static final boolean method5481(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, class185 arg6) {
      int var7 = client.field4530;

      try {
         ++field11132;
         if (class554.field8210 && class333.field4773) {
            if (class171.field2123 < 100) {
               return false;
            } else if (~arg0 == ~arg3 && arg4 == arg5) {
               if (!class499.method3722(arg0, arg2, 86, arg5)) {
                  return false;
               } else if (class39.method269((byte)44, arg6)) {
                  ++class556.field8259;
                  return true;
               } else {
                  return false;
               }
            } else {
               int var8 = arg0;
               int var10000;
               int var9;
               if (var7 != 0) {
                  var9 = arg5;
                  if (var7 != 0) {
                     if (~class664.field9661[arg2][arg0][arg5] == ~(-class242.field3081)) {
                        return false;
                     }

                     var9 = arg5 + 1;
                  }
               } else {
                  if (arg3 < arg0) {
                     var10000 = class39.method269((byte)44, arg6);
                     if (var7 == 0) {
                        if (var10000 == 0) {
                           return false;
                        }

                        if (arg1) {
                           field11134 = null;
                        }

                        ++class556.field8259;
                        return true;
                     }
                  } else {
                     var10000 = arg5;
                  }

                  var9 = var10000;
                  if (var7 != 0) {
                     if (~class664.field9661[arg2][arg0][var9] == ~(-class242.field3081)) {
                        return false;
                     }

                     ++var9;
                  }
               }

               while(true) {
                  while(var9 <= arg4) {
                     if (~class664.field9661[arg2][var8][var9] == ~(-class242.field3081)) {
                        return false;
                     }

                     ++var9;
                  }

                  if (var7 == 0) {
                     ++var8;
                     if (arg3 < var8) {
                        var10000 = class39.method269((byte)44, arg6);
                        if (var7 == 0) {
                           if (var10000 == 0) {
                              return false;
                           }

                           if (arg1) {
                              field11134 = null;
                           }

                           ++class556.field8259;
                           return true;
                        }
                     } else {
                        var10000 = arg5;
                     }

                     var9 = var10000;
                     if (var7 != 0) {
                        if (~class664.field9661[arg2][var8][var9] == ~(-class242.field3081)) {
                           return false;
                        }

                        ++var9;
                     }
                  } else {
                     ++var9;
                  }
               }
            }
         } else {
            return false;
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field11140[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field11140[1] : field11140[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "a",
      descriptor = "(ILjava/io/File;I)[B"
   )
   public static final byte[] method5482(int arg0, File arg1, int arg2) {
      try {
         if (arg2 != 0) {
            field11133 = 41;
         }

         ++field11137;

         try {
            byte[] var3 = new byte[arg0];
            class521.method3844(arg0, false, var3, arg1);
            return var3;
         } catch (IOException var5) {
            return null;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field11140[7] + arg0 + ',' + (arg1 != null ? field11140[1] : field11140[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method2824(byte arg0) {
      try {
         ++field11136;
         if (arg0 < 31) {
            this.method2821(false);
         }

         return this.field11138;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11140[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method2821(boolean arg0) {
      try {
         if (arg0) {
            return -126;
         } else {
            ++field11130;
            return 0;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11140[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method2822(int arg0) {
      try {
         ++field11131;
         if (arg0 != 16968) {
            method5481(-18, true, -109, -128, -127, 127, (class185)null);
         }

         return super.field1660.getAddress();
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11140[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "a",
      descriptor = "(II[BI)V"
   )
   public final void method2823(int arg0, int arg1, byte[] arg2, int arg3) {
      try {
         if (arg0 >= 32) {
            ++field11139;
            this.method1137(arg2, arg3);
            this.field11138 = arg1;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field11140[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11140[1] : field11140[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5483(int arg0) {
      try {
         if (arg0 != 0) {
            field11129 = -87;
         }

         field11134 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11140[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5484(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5485(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 9;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
