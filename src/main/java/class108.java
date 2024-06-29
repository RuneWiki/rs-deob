import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class108 extends class549 {
   @OriginalMember(
      owner = "client!ec",
      name = "D",
      descriptor = "I"
   )
   private int field1442;
   @OriginalMember(
      owner = "client!ec",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1444 = new String[]{method973(method972(";ZdI\b")), method973(method972(";ZdL\b")), method973(method972(";ZdN\b")), method973(method972("%\u0017d!]")), method973(method972("0L&c")), method973(method972(";Zd3I0P>1\b")), method973(method972(";ZdK\b")), method973(method972(";ZdM\b")), method973(method972(";ZdJ\b"))};
   @OriginalMember(
      owner = "client!ec",
      name = "w",
      descriptor = "[[I"
   )
   public static int[][] field1441 = new int[6][];
   @OriginalMember(
      owner = "client!ec",
      name = "x",
      descriptor = "I"
   )
   public static int field1436;
   @OriginalMember(
      owner = "client!ec",
      name = "B",
      descriptor = "I"
   )
   public static int field1438;
   @OriginalMember(
      owner = "client!ec",
      name = "C",
      descriptor = "I"
   )
   public static int field1439;
   @OriginalMember(
      owner = "client!ec",
      name = "A",
      descriptor = "I"
   )
   public static int field1440;
   @OriginalMember(
      owner = "client!ec",
      name = "y",
      descriptor = "I"
   )
   public static int field1443;
   @OriginalMember(
      owner = "client!ec",
      name = "z",
      descriptor = "[I"
   )
   public static int[] field1437;

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "(IIILnk;III)Z"
   )
   public static final boolean method966(int arg0, int arg1, int arg2, class484 arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field1481;

      try {
         ++field1440;
         if (class613.field9018 && class78.field1042) {
            if (arg6 < ~class516.field7237) {
               return false;
            } else if (~arg1 == ~arg2 && ~arg4 == ~arg5) {
               if (!class725.method5252(arg4, arg0, arg2, -1)) {
                  return false;
               } else if (class89.method831((byte)-105, arg3)) {
                  ++class159.field2042;
                  return true;
               } else {
                  return false;
               }
            } else {
               int var8 = arg2;
               int var10000;
               int var9;
               if (var7) {
                  var9 = arg4;
                  if (var7) {
                     if (class46.field586[arg0][arg2][arg4] == -class208.field2646) {
                        return false;
                     }

                     var9 = arg4 + 1;
                  }
               } else {
                  if (arg2 > arg1) {
                     var10000 = class89.method831((byte)-105, arg3);
                     if (!var7) {
                        if (var10000 == 0) {
                           return false;
                        }

                        ++class159.field2042;
                        return true;
                     }
                  } else {
                     var10000 = arg4;
                  }

                  var9 = var10000;
                  if (var7) {
                     if (class46.field586[arg0][arg2][var9] == -class208.field2646) {
                        return false;
                     }

                     ++var9;
                  }
               }

               while(true) {
                  while(var9 <= arg5) {
                     if (class46.field586[arg0][var8][var9] == -class208.field2646) {
                        return false;
                     }

                     ++var9;
                  }

                  if (!var7) {
                     ++var8;
                     if (var8 > arg1) {
                        var10000 = class89.method831((byte)-105, arg3);
                        if (!var7) {
                           if (var10000 == 0) {
                              return false;
                           }

                           ++class159.field2042;
                           return true;
                        }
                     } else {
                        var10000 = arg4;
                     }

                     var9 = var10000;
                     if (var7) {
                        if (class46.field586[arg0][var8][var9] == -class208.field2646) {
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
         throw class93.method866(var11, field1444[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1444[3] : field1444[4]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method967(byte arg0, int arg1) {
      try {
         ++field1436;
         if (arg1 != -1) {
            if (class316.field4369[arg1]) {
               if (arg0 <= -40) {
                  class168.field2196.method2682(-15639, arg1);
                  class419.field5722[arg1] = null;
                  class778.field11337[arg1] = null;
                  class316.field4369[arg1] = false;
               }
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1444[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "f",
      descriptor = "(I)V"
   )
   public static final void method968(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ec",
      name = "<init>",
      descriptor = "(Liu;II[BI)V"
   )
   public class108(class530 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
      super(arg0, 3552, arg1, arg2, false);

      try {
         this.field1442 = arg2;
         super.field8096.method4006(this, (byte)-123);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glTexImage1Dub(super.field8090, 0, super.field8100, this.field1442, 0, arg4, 5121, arg3, 0);
         OpenGL.glPixelStorei(3317, 4);
         this.method4157((byte)111, true);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field1444[5] + (arg0 != null ? field1444[3] : field1444[4]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1444[3] : field1444[4]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "d",
      descriptor = "(B)V"
   )
   public static void method969(byte arg0) {
      try {
         field1441 = null;
         field1437 = null;
         if (arg0 > -10) {
            field1437 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1444[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method970(byte arg0) {
      try {
         ++field1443;
         if (arg0 > -12) {
            field1437 = null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1444[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "b",
      descriptor = "(ZI)V"
   )
   public final void method971(boolean arg0, int arg1) {
      try {
         ++field1438;
         super.field8096.method4006(this, (byte)-123);
         OpenGL.glTexParameteri(super.field8090, 10242, !arg0 ? 33071 : 10497);
         if (arg1 != 25699) {
            field1437 = null;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1444[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method972(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method973(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 57;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
