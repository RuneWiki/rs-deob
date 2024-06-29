import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class619 implements Runnable {
   @OriginalMember(
      owner = "client!nu",
      name = "g",
      descriptor = "Lpl;"
   )
   public class679 field9112 = null;
   @OriginalMember(
      owner = "client!nu",
      name = "E",
      descriptor = "Lvca;"
   )
   private class296 field9115 = null;
   @OriginalMember(
      owner = "client!nu",
      name = "j",
      descriptor = "Z"
   )
   public boolean field9110 = false;
   @OriginalMember(
      owner = "client!nu",
      name = "e",
      descriptor = "Lvca;"
   )
   private class296 field9119 = null;
   @OriginalMember(
      owner = "client!nu",
      name = "i",
      descriptor = "Lpl;"
   )
   public class679 field9135 = null;
   @OriginalMember(
      owner = "client!nu",
      name = "h",
      descriptor = "Lpl;"
   )
   public class679 field9137 = null;
   @OriginalMember(
      owner = "client!nu",
      name = "v",
      descriptor = "Z"
   )
   public boolean field9134 = false;
   @OriginalMember(
      owner = "client!nu",
      name = "p",
      descriptor = "Z"
   )
   private boolean field9126 = false;
   @OriginalMember(
      owner = "client!nu",
      name = "k",
      descriptor = "Ljava/awt/EventQueue;"
   )
   public EventQueue field9132;
   @OriginalMember(
      owner = "client!nu",
      name = "D",
      descriptor = "[Lpl;"
   )
   public class679[] field9123;
   @OriginalMember(
      owner = "client!nu",
      name = "x",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field9114;
   @OriginalMember(
      owner = "client!nu",
      name = "c",
      descriptor = "Lcaa;"
   )
   private class320 field9117;
   @OriginalMember(
      owner = "client!nu",
      name = "o",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field9116;
   @OriginalMember(
      owner = "client!nu",
      name = "z",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field9118;
   @OriginalMember(
      owner = "client!nu",
      name = "n",
      descriptor = "Lps;"
   )
   private class105 field9130;
   @OriginalMember(
      owner = "client!nu",
      name = "y",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field9128;
   @OriginalMember(
      owner = "client!nu",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9142 = new String[]{method4514(method4513("r6`{ky b4\u0015w>xn")), method4514(method4513("w!")), method4514(method4513("p#bj\u007f7x")), method4514(method4513("t>en(w3si")), method4514(method4513("y5u~ ~0~s/s;{t*h&di1m!ab<b\u0016TY\u0001]\u0011QR\fR\u001cZW\u000bW\u0007GH\u0016L\u0002@M\u001dA\r&+w+c#,r n)<x4y31hGt,5o")), method4514(method4513("r6`{ky b4\u0006w:fu+}9b")), method4514(method4513("}/\u007fn")), method4514(method4513("r6`{ky b4\u0003j6{\u007f")), method4514(method4513("{:r:j{wen$j#68/:w4")), method4514(method4513("o>x")), method4514(method4513("p0w")), method4514(method4513("k?ym&m%eu7")), method4514(method4513("p#bj6\"x9")), method4514(method4513("R6q\u007f=8\u0011cv)8\u0004uh }9")), method4514(method4513("u8`\u007f(w\"e\u007f")), method4514(method4513("C\u001e")), method4514(method4513("k2by0k#yw&m%eu7")), method4514(method4513("}9b\u007f7")), method4514(method4513("G'd\u007f#}%st&}$")), method4514(method4513("r6q\u007f=G")), method4514(method4513("{m9h6{6ur 7")), method4514(method4513("{m9m,v3ym67")), method4514(method4513("63wn")), method4514(method4513("7%ey${?s5")), method4514(method4513("{m9")), method4514(method4513("{m9m,v9b5")), method4514(method4513("G \u007fjk|6b")), method4514(method4513("j ")), method4514(method4513("G%u4!y#")), method4514(method4513("7#{jj")), method4514(method4513("Y\u0000B")), method4514(method4513("j6x~*uyr{1")), method4514(method4513("u>uh*k8pn")), method4514(method4513("u6\u007ft\u001a~>z\u007f\u001a{6ur 63wnw")), method4514(method4513("r6`{kn2x~*j")), method4514(method4513("w$8t$u2")), method4514(method4513("fx")), method4514(method4513(")y'")), method4514(method4513("r6`{kn2di,w9")), method4514(method4513("m9")), method4514(method4513("r6`{ky b4\u0006w9b{,v2d")), method4514(method4513("k2b\\*{\"eY<{;sH*w#")), method4514(method4513("m$shkp8{\u007f")), method4514(method4513("w$8l j$\u007fu+")), method4514(method4513("w$8{7{?")), method4514(method4513("k2b\\*{\"eN7y!sh6y;]\u007f<k\u0012x{'t2r")), method4514(method4513("u6\u007ft\u001a~>z\u007f\u001a{6ur 6>rbw-b")), method4514(method4513("u6\u007ft\u001a~>z\u007f\u001a{6ur 6>rb")), method4514(method4513("M9}t*o9"))};
   @OriginalMember(
      owner = "client!nu",
      name = "l",
      descriptor = "J"
   )
   private static volatile long field9127 = 0L;
   @OriginalMember(
      owner = "client!nu",
      name = "B",
      descriptor = "I"
   )
   private static int field9113;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!nu",
      name = "s",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field9138;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!nu",
      name = "F",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field9139;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!nu",
      name = "d",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field9140;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!nu",
      name = "f",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field9141;
   @OriginalMember(
      owner = "client!nu",
      name = "b",
      descriptor = "Ljava/lang/String;"
   )
   private static String field9111;
   @OriginalMember(
      owner = "client!nu",
      name = "q",
      descriptor = "Ljava/lang/String;"
   )
   public static String field9120;
   @OriginalMember(
      owner = "client!nu",
      name = "t",
      descriptor = "Ljava/lang/String;"
   )
   public static String field9121;
   @OriginalMember(
      owner = "client!nu",
      name = "A",
      descriptor = "Ljava/lang/String;"
   )
   private static String field9124;
   @OriginalMember(
      owner = "client!nu",
      name = "C",
      descriptor = "Ljava/lang/String;"
   )
   public static String field9129;
   @OriginalMember(
      owner = "client!nu",
      name = "m",
      descriptor = "Ljava/lang/String;"
   )
   private static String field9131;
   @OriginalMember(
      owner = "client!nu",
      name = "r",
      descriptor = "Ljava/lang/String;"
   )
   public static String field9133;
   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public static String field9136;
   @OriginalMember(
      owner = "client!nu",
      name = "u",
      descriptor = "Ljava/lang/reflect/Method;"
   )
   public static Method field9122;
   @OriginalMember(
      owner = "client!nu",
      name = "w",
      descriptor = "Ljava/lang/reflect/Method;"
   )
   public static Method field9125;

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Lvca;"
   )
   public final class296 method4492(String arg0, int arg1) {
      if (arg1 != 0) {
         this.run();
      }

      return this.method4506(0, 0, 0, arg0, 16);
   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(II)Lvca;"
   )
   public final class296 method4493(int arg0, int arg1) {
      return arg1 < 78 ? null : this.method4506(0, 0, arg0, (Object)null, 3);
   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(Ljava/lang/String;IZI)Lvca;"
   )
   public final class296 method4494(String arg0, int arg1, boolean arg2, int arg3) {
      if (arg1 != 0) {
         this.method4508((byte)101, (String)null, false);
      }

      return this.method4506(0, 0, arg3, arg0, arg2 ? 22 : 1);
   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method4495(int arg0) {
      synchronized(this) {
         this.field9126 = true;
         this.notifyAll();
      }

      try {
         this.field9128.join();
      } catch (InterruptedException var8) {
      }

      if (this.field9112 != null) {
         try {
            this.field9112.method4960(true);
         } catch (IOException var7) {
         }
      }

      if (this.field9137 != null) {
         try {
            this.field9137.method4960(true);
         } catch (IOException var6) {
         }
      }

      if (arg0 < 95) {
         this.method4501((Frame)null, -48);
      }

      if (this.field9123 != null) {
         for(int var3 = 0; ~var3 > ~this.field9123.length; ++var3) {
            if (this.field9123[var3] != null) {
               try {
                  this.field9123[var3].method4960(true);
               } catch (IOException var5) {
               }
            }
         }
      }

      if (this.field9135 != null) {
         try {
            this.field9135.method4960(true);
         } catch (IOException var4) {
         }
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(ZLjava/lang/String;)Lpl;"
   )
   public static final class679 method4496(boolean arg0, String arg1) {
      if (!arg0) {
         method4507(-90, (String)null, 70, (String)null);
      }

      return method4507(-10894, field9111, field9113, arg1);
   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(Z)Ljava/lang/Object;"
   )
   public final Object method4497(boolean arg0) {
      if (arg0) {
         field9125 = null;
      }

      return this.field9114;
   }

   @OriginalMember(
      owner = "client!nu",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      while(true) {
         class296 var2;
         synchronized(this) {
            while(true) {
               if (this.field9126) {
                  return;
               }

               if (this.field9119 != null) {
                  var2 = this.field9119;
                  this.field9119 = this.field9119.field4081;
                  if (this.field9119 == null) {
                     this.field9115 = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var30) {
               }
            }
         }

         try {
            int var3 = var2.field4075;
            if (~var3 == -2) {
               if (~field9127 < ~class133.method1054(-29025)) {
                  throw new IOException();
               }

               var2.field4077 = new Socket(InetAddress.getByName((String)var2.field4080), var2.field4079);
            } else if (~var3 == -23) {
               if (~class133.method1054(-29025) > ~field9127) {
                  throw new IOException();
               }

               try {
                  var2.field4077 = class535.method3855((String)var2.field4080, -117, var2.field4079).method1122(6677);
               } catch (class86 var29) {
                  var2.field4077 = var29.getMessage();
                  throw var29;
               }
            } else if (var3 == 2) {
               Thread var5 = new Thread((Runnable)var2.field4080);
               var5.setDaemon(true);
               var5.start();
               var5.setPriority(var2.field4079);
               var2.field4077 = var5;
            } else if (var3 == 4) {
               if (class133.method1054(-29025) < field9127) {
                  throw new IOException();
               }

               var2.field4077 = new DataInputStream(((URL)var2.field4080).openStream());
            } else if (~var3 == -9) {
               Object[] var6 = (Object[])var2.field4080;
               if (this.field9134 && ((Class)var6[0]).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.field4077 = ((Class)var6[0]).getDeclaredMethod((String)var6[1], (Class[])var6[2]);
            } else if (var3 == 9) {
               Object[] var7 = (Object[])var2.field4080;
               if (this.field9134 && ((Class)var7[0]).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.field4077 = ((Class)var7[0]).getDeclaredField((String)var7[1]);
            } else if (var3 == 18) {
               Clipboard var23 = Toolkit.getDefaultToolkit().getSystemClipboard();
               var2.field4077 = var23.getContents((Object)null);
            } else if (~var3 == -20) {
               Transferable var8 = (Transferable)var2.field4080;
               Clipboard var9 = Toolkit.getDefaultToolkit().getSystemClipboard();
               var9.setContents(var8, (ClipboardOwner)null);
            } else {
               if (!this.field9134) {
                  throw new Exception("");
               }

               if (~var3 != -4) {
                  if (var3 == 21) {
                     if (~field9127 < ~class133.method1054(-29025)) {
                        throw new IOException();
                     }

                     var2.field4077 = InetAddress.getByName((String)var2.field4080).getAddress();
                  } else if (~var3 == -6) {
                     if (this.field9110) {
                        var2.field4077 = this.field9117.method2373((byte)-1);
                     } else {
                        var2.field4077 = Class.forName(field9142[1]).getMethod(field9142[3]).invoke(this.field9116);
                     }
                  } else if (var3 == 6) {
                     Frame var10 = new Frame(field9142[13]);
                     var2.field4077 = var10;
                     var10.setResizable(false);
                     if (this.field9110) {
                        this.field9117.method2371(65535 & var2.field4076, var10, var2.field4076 >> 16, 0, var2.field4079 >>> 16, 65535 & var2.field4079);
                     } else {
                        Class.forName(field9142[1]).getMethod(field9142[17], field9138 != null ? field9138 : (field9138 = method4512(field9142[7])), Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field9116, var10, new Integer(var2.field4079 >>> 16), new Integer(var2.field4079 & 65535), new Integer(var2.field4076 >> 16), new Integer(var2.field4076 & 65535));
                     }
                  } else if (~var3 == -8) {
                     if (!this.field9110) {
                        Class.forName(field9142[1]).getMethod(field9142[6]).invoke(this.field9116);
                     } else {
                        this.field9117.method2372((Frame)var2.field4080, (byte)123);
                     }
                  } else if (var3 == 12) {
                     class679 var21 = method4507(-10894, field9111, field9113, (String)var2.field4080);
                     var2.field4077 = var21;
                  } else if (var3 != 13) {
                     if (this.field9134 && var3 == 14) {
                        int var11 = var2.field4079;
                        int var12 = var2.field4076;
                        if (!this.field9110) {
                           Class.forName(field9142[10]).getDeclaredMethod(field9142[14], Integer.TYPE, Integer.TYPE).invoke(this.field9118, new Integer(var11), new Integer(var12));
                        } else {
                           this.field9130.method866(var11, 65535, var12);
                        }
                     } else if (this.field9134 && ~var3 == -16) {
                        boolean var18 = ~var2.field4079 != -1;
                        Component var19 = (Component)var2.field4080;
                        if (this.field9110) {
                           this.field9130.method865(var19, -31672, var18);
                        } else {
                           Class.forName(field9142[10]).getDeclaredMethod(field9142[11], field9139 != null ? field9139 : (field9139 = method4512(field9142[5])), Boolean.TYPE).invoke(this.field9118, var19, new Boolean(var18));
                        }
                     } else if (!this.field9110 && ~var3 == -18) {
                        Object[] var13 = (Object[])var2.field4080;
                        Class.forName(field9142[10]).getDeclaredMethod(field9142[16], field9139 != null ? field9139 : (field9139 = method4512(field9142[5])), field9140 != null ? field9140 : (field9140 = method4512(field9142[15])), Integer.TYPE, Integer.TYPE, field9141 != null ? field9141 : (field9141 = method4512(field9142[0]))).invoke(this.field9118, (Component)var13[0], (int[])var13[1], new Integer(var2.field4079), new Integer(var2.field4076), (Point)var13[2]);
                     } else {
                        if (~var3 != -17) {
                           throw new Exception("");
                        }

                        try {
                           if (!field9120.startsWith(field9142[9])) {
                              throw new Exception();
                           }

                           String var14 = (String)var2.field4080;
                           if (!var14.startsWith(field9142[2]) && !var14.startsWith(field9142[12])) {
                              throw new Exception();
                           }

                           String var15 = field9142[4];

                           for(int var16 = 0; var16 < var14.length(); ++var16) {
                              if (~var15.indexOf(var14.charAt(var16)) == 0) {
                                 throw new Exception();
                              }
                           }

                           Runtime.getRuntime().exec(field9142[8] + var14 + "\"");
                           var2.field4077 = null;
                        } catch (Exception var31) {
                           var2.field4077 = var31;
                           throw var31;
                        }
                     }
                  } else {
                     class679 var20 = method4507(-10894, "", field9113, (String)var2.field4080);
                     var2.field4077 = var20;
                  }
               } else {
                  if (~field9127 < ~class133.method1054(-29025)) {
                     throw new IOException();
                  }

                  String var22 = (255 & var2.field4079 >> 24) + "." + (255 & var2.field4079 >> 16) + "." + ((65324 & var2.field4079) >> 8) + "." + (var2.field4079 & 255);
                  var2.field4077 = InetAddress.getByName(var22).getHostName();
               }
            }

            var2.field4078 = 1;
         } catch (ThreadDeath var32) {
            throw var32;
         } catch (Throwable var33) {
            var2.field4078 = 2;
         }

         synchronized(var2) {
            var2.notify();
         }
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method4498(int arg0) {
      field9127 = class133.method1054(-29025) + (long)arg0;
   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lvca;"
   )
   public final class296 method4499(String arg0, int arg1, Class arg2) {
      if (arg1 != 9) {
         this.method4504((Runnable)null, 81, -41);
      }

      return this.method4506(0, 0, 0, new Object[]{arg2, arg0}, 9);
   }

   @OriginalMember(
      owner = "client!nu",
      name = "b",
      descriptor = "(I)Lvca;"
   )
   public final class296 method4500(int arg0) {
      return arg0 < 111 ? null : this.method4506(0, 0, 0, (Object)null, 5);
   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(Ljava/awt/Frame;I)Lvca;"
   )
   public final class296 method4501(Frame arg0, int arg1) {
      return arg1 != 31302 ? null : this.method4506(0, 0, 0, arg0, 7);
   }

   @OriginalMember(
      owner = "client!nu",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method4502(int arg0) {
      if (arg0 <= 50) {
         return true;
      } else if (!this.field9134) {
         return false;
      } else if (!this.field9110) {
         return this.field9116 != null;
      } else {
         return this.field9117 != null;
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(Ljava/awt/Point;[IILjava/awt/Component;II)Lvca;"
   )
   public final class296 method4503(Point arg0, int[] arg1, int arg2, Component arg3, int arg4, int arg5) {
      if (arg2 != 65324) {
         this.field9117 = null;
      }

      return this.method4506(arg2 + -65324, arg4, arg5, new Object[]{arg3, arg1, arg0}, 17);
   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(Ljava/lang/Runnable;II)Lvca;"
   )
   public final class296 method4504(Runnable arg0, int arg1, int arg2) {
      if (arg2 != 0) {
         this.field9123 = null;
      }

      return this.method4506(0, 0, arg1, arg0, 2);
   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(IIIII)Lvca;"
   )
   public final class296 method4505(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg4 != -1455125744) {
         this.field9128 = null;
      }

      return this.method4506(arg4 ^ -1455125744, (arg3 << 16) - -arg0, (arg1 << 16) + arg2, (Object)null, 6);
   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(IIILjava/lang/Object;I)Lvca;"
   )
   private final class296 method4506(int arg0, int arg1, int arg2, Object arg3, int arg4) {
      if (arg0 != 0) {
         field9122 = null;
      }

      class296 var6 = new class296();
      var6.field4079 = arg2;
      var6.field4080 = arg3;
      var6.field4076 = arg1;
      var6.field4075 = arg4;
      synchronized(this) {
         if (this.field9115 == null) {
            this.field9115 = this.field9119 = var6;
         } else {
            this.field9115.field4081 = var6;
            this.field9115 = var6;
         }

         this.notify();
         return var6;
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(ILjava/lang/String;ILjava/lang/String;)Lpl;"
   )
   private static final class679 method4507(int arg0, String arg1, int arg2, String arg3) {
      String var4;
      if (arg2 == 33) {
         var4 = field9142[19] + arg1 + field9142[18] + arg3 + field9142[28];
      } else if (~arg2 == -35) {
         var4 = field9142[19] + arg1 + field9142[18] + arg3 + field9142[26];
      } else {
         var4 = field9142[19] + arg1 + field9142[18] + arg3 + field9142[22];
      }

      if (arg0 != -10894) {
         field9133 = null;
      }

      String[] var5 = new String[]{field9142[20], field9142[23], field9131, field9142[21], field9142[25], field9142[24], field9142[29], ""};

      for(int var6 = 0; var6 < var5.length; ++var6) {
         String var7 = var5[var6];
         if (~var7.length() >= -1 || (new File(var7)).exists()) {
            try {
               return new class679(new File(var7, var4), field9142[27], 10000L);
            } catch (Exception var9) {
            }
         }
      }

      return null;
   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(BLjava/lang/String;Z)Lvca;"
   )
   public final class296 method4508(byte arg0, String arg1, boolean arg2) {
      if (arg0 < 92) {
         return null;
      } else {
         return !arg2 ? this.method4506(0, 0, 0, arg1, 13) : this.method4506(0, 0, 0, arg1, 12);
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(BLjava/net/URL;)Lvca;"
   )
   public final class296 method4509(byte arg0, URL arg1) {
      return arg0 <= 25 ? null : this.method4506(0, 0, 0, arg1, 4);
   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "([Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;I)Lvca;"
   )
   public final class296 method4510(Class[] arg0, Class arg1, String arg2, int arg3) {
      if (arg3 <= 118) {
         this.method4505(80, -68, -61, 63, -49);
      }

      return this.method4506(0, 0, 0, new Object[]{arg1, arg2, arg0}, 8);
   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(Z[BLjava/io/File;)Z"
   )
   public final boolean method4511(boolean arg0, byte[] arg1, File arg2) {
      if (!arg0) {
         return false;
      } else {
         try {
            FileOutputStream var4 = new FileOutputStream(arg2);
            var4.write(arg1, 0, arg1.length);
            var4.close();
            return true;
         } catch (IOException var5) {
            throw new RuntimeException();
         }
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "<init>",
      descriptor = "(ILjava/lang/String;IZ)V"
   )
   public class619(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
      field9111 = arg1;
      field9133 = field9142[37];
      this.field9134 = arg3;
      field9136 = field9142[48];
      field9113 = arg0;

      try {
         field9136 = System.getProperty(field9142[34]);
         field9133 = System.getProperty(field9142[38]);
      } catch (Exception var20) {
      }

      if (~field9136.toLowerCase().indexOf(field9142[32]) != 0) {
         this.field9110 = true;
      }

      try {
         field9124 = System.getProperty(field9142[35]);
      } catch (Exception var19) {
         field9124 = field9142[48];
      }

      field9120 = field9124.toLowerCase();

      try {
         field9129 = System.getProperty(field9142[44]).toLowerCase();
      } catch (Exception var18) {
         field9129 = "";
      }

      try {
         field9121 = System.getProperty(field9142[43]).toLowerCase();
      } catch (Exception var17) {
         field9121 = "";
      }

      try {
         field9131 = System.getProperty(field9142[42]);
         if (field9131 != null) {
            field9131 = field9131 + "/";
         }
      } catch (Exception var16) {
      }

      if (field9131 == null) {
         field9131 = field9142[36];
      }

      try {
         this.field9132 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var15) {
      }

      if (!this.field9110) {
         try {
            field9122 = Class.forName(field9142[5]).getDeclaredMethod(field9142[45], Boolean.TYPE);
         } catch (Exception var14) {
         }

         try {
            field9125 = Class.forName(field9142[40]).getDeclaredMethod(field9142[41], Boolean.TYPE);
         } catch (Exception var13) {
         }
      }

      class219.method1724(field9111, -22986, field9113);
      if (this.field9134) {
         this.field9135 = new class679(class219.method1725(89, field9142[31], (String)null, field9113), field9142[27], 25L);
         this.field9112 = new class679(class219.method1726(field9142[33], 0), field9142[27], 314572800L);
         this.field9137 = new class679(class219.method1726(field9142[46], 0), field9142[27], 1048576L);
         this.field9123 = new class679[arg2];

         for(int var5 = 0; var5 < arg2; ++var5) {
            this.field9123[var5] = new class679(class219.method1726(field9142[47] + var5, 0), field9142[27], 1048576L);
         }

         if (this.field9110) {
            try {
               this.field9114 = Class.forName(field9142[39]).newInstance();
            } catch (Throwable var12) {
            }
         }

         try {
            if (this.field9110) {
               this.field9117 = new class320();
            } else {
               this.field9116 = Class.forName(field9142[1]).newInstance();
            }
         } catch (Throwable var11) {
         }

         try {
            if (!this.field9110) {
               this.field9118 = Class.forName(field9142[10]).newInstance();
            } else {
               this.field9130 = new class105();
            }
         } catch (Throwable var10) {
         }
      }

      if (this.field9134 && !this.field9110) {
         ThreadGroup var6 = Thread.currentThread().getThreadGroup();

         for(ThreadGroup var7 = var6.getParent(); var7 != null; var7 = var7.getParent()) {
            var6 = var7;
         }

         Thread[] var8 = new Thread[1000];
         var6.enumerate(var8);

         for(int var9 = 0; var9 < var8.length; ++var9) {
            if (var8[var9] != null && var8[var9].getName().startsWith(field9142[30])) {
               var8[var9].setPriority(1);
            }
         }
      }

      this.field9126 = false;
      this.field9128 = new Thread(this);
      this.field9128.setPriority(10);
      this.field9128.setDaemon(true);
      this.field9128.start();
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method4512(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4513(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4514(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
