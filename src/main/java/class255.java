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

@OriginalClass("client!bj")
public class class255 implements Runnable {
   @OriginalMember(
      owner = "client!bj",
      name = "E",
      descriptor = "Z"
   )
   private boolean field3240 = false;
   @OriginalMember(
      owner = "client!bj",
      name = "w",
      descriptor = "Lti;"
   )
   public class468 field3249 = null;
   @OriginalMember(
      owner = "client!bj",
      name = "A",
      descriptor = "Lti;"
   )
   public class468 field3246 = null;
   @OriginalMember(
      owner = "client!bj",
      name = "l",
      descriptor = "Lvea;"
   )
   private class289 field3250 = null;
   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "Z"
   )
   public boolean field3257 = false;
   @OriginalMember(
      owner = "client!bj",
      name = "p",
      descriptor = "Lti;"
   )
   public class468 field3260 = null;
   @OriginalMember(
      owner = "client!bj",
      name = "h",
      descriptor = "Lvea;"
   )
   private class289 field3259 = null;
   @OriginalMember(
      owner = "client!bj",
      name = "F",
      descriptor = "Z"
   )
   public boolean field3265 = false;
   @OriginalMember(
      owner = "client!bj",
      name = "s",
      descriptor = "Ljava/awt/EventQueue;"
   )
   public EventQueue field3241;
   @OriginalMember(
      owner = "client!bj",
      name = "e",
      descriptor = "[Lti;"
   )
   public class468[] field3252;
   @OriginalMember(
      owner = "client!bj",
      name = "v",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field3238;
   @OriginalMember(
      owner = "client!bj",
      name = "o",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field3262;
   @OriginalMember(
      owner = "client!bj",
      name = "u",
      descriptor = "Lqea;"
   )
   private class137 field3254;
   @OriginalMember(
      owner = "client!bj",
      name = "C",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field3255;
   @OriginalMember(
      owner = "client!bj",
      name = "g",
      descriptor = "Luia;"
   )
   private class385 field3242;
   @OriginalMember(
      owner = "client!bj",
      name = "r",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field3251;
   @OriginalMember(
      owner = "client!bj",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3270 = new String[]{method1959(method1958("1.kNw}4}\u0002")), method1959(method1958("A,jHp{.}Cu{/")), method1959(method1958("t=\u007fHnA")), method1959(method1958("1(u]9")), method1959(method1958("A.{\u0003r\u007f(")), method1959(method1958("}f7Z\u007fp8wZe1")), method1959(method1958("08yY")), method1959(method1958("}f7Z\u007fp2l\u0002")), method1959(method1958("A+q]8z=l")), method1959(method1958("}f7_e}={Es1")), method1959(method1958("}f7")), method1959(method1958("l+")), method1959(method1958("i5v")), method1959(method1958("E\u0015")), method1959(method1958("m9lNcm(w@uk.kBd")), method1959(method1958("}1|\r9}|kYwl(8\u000f|<|:")), method1959(method1958("\u007f>{Isx;pD|u0uCyn-j^bk*oUod\u001dZnR[\u001a_e_T\u0017T`XQ\fI\u007fEJ\tNzNG\u0006(\u001c$-h-\u001b!&e'\u000b+2r=\u0006;A\u007f\"\u0002<")), method1959(method1958("t=nL8\u007f+l\u0003Pl=uH")), method1959(method1958("{2lHd")), method1959(method1958("}-")), method1959(method1958("m4wZuk.kBd")), method1959(method1958("T=\u007fHn>\u001amAz>\u000f{_s{2")), method1959(method1958("r5kY{q8}^")), method1959(method1958("s3nH{q)kH")), method1959(method1958("v(l],1s")), method1959(method1958("v(l]e$s7")), method1959(method1958("t=nL8\u007f+l\u0003Uq1hBx{2l")), method1959(method1958("{$qY")), method1959(method1958("t=nL8\u007f+l\u0003Fq5vY")), method1959(method1958("n5y")), method1959(method1958("k/}_8v3uH")), method1959(method1958("t=nL8h9vIyl")), method1959(method1958("m9lky})kyd\u007f*}_e\u007f0SHom\u0019vLtr9|")), method1959(method1958("q/6[sl/qBx")), method1959(method1958("t=nL8\u007f+l\u0003Uq2lL\u007fp9j")), method1959(method1958("s5{_ym3~Y")), method1959(method1958("q/6Cws9")), method1959(method1958("s=qCIx5tHI}={Es05|U$+i")), method1959(method1958("t=nL8h9j^\u007fq2")), method1959(method1958("q/6Ld}4")), method1959(method1958("s=qCIx5tHI}={Es08yY$")), method1959(method1958("k4")), method1959(method1958("s=qCIx5tHI}={Es05|U")), method1959(method1958("l=vIysr|Lb")), method1959(method1958("`s")), method1959(method1958("K2sCyi2")), method1959(method1958("_\u000bL")), method1959(method1958("/r)")), method1959(method1958("m9lky})kno}0}\u007fyq("))};
   @OriginalMember(
      owner = "client!bj",
      name = "q",
      descriptor = "J"
   )
   private static volatile long field3244 = 0L;
   @OriginalMember(
      owner = "client!bj",
      name = "c",
      descriptor = "I"
   )
   private static int field3243;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!bj",
      name = "x",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field3266;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!bj",
      name = "y",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field3267;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!bj",
      name = "n",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field3268;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!bj",
      name = "D",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field3269;
   @OriginalMember(
      owner = "client!bj",
      name = "k",
      descriptor = "Ljava/lang/String;"
   )
   public static String field3245;
   @OriginalMember(
      owner = "client!bj",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   public static String field3248;
   @OriginalMember(
      owner = "client!bj",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   private static String field3253;
   @OriginalMember(
      owner = "client!bj",
      name = "t",
      descriptor = "Ljava/lang/String;"
   )
   private static String field3256;
   @OriginalMember(
      owner = "client!bj",
      name = "i",
      descriptor = "Ljava/lang/String;"
   )
   public static String field3258;
   @OriginalMember(
      owner = "client!bj",
      name = "f",
      descriptor = "Ljava/lang/String;"
   )
   public static String field3261;
   @OriginalMember(
      owner = "client!bj",
      name = "m",
      descriptor = "Ljava/lang/String;"
   )
   public static String field3263;
   @OriginalMember(
      owner = "client!bj",
      name = "b",
      descriptor = "Ljava/lang/String;"
   )
   private static String field3264;
   @OriginalMember(
      owner = "client!bj",
      name = "B",
      descriptor = "Ljava/lang/reflect/Method;"
   )
   public static Method field3239;
   @OriginalMember(
      owner = "client!bj",
      name = "j",
      descriptor = "Ljava/lang/reflect/Method;"
   )
   public static Method field3247;

   @OriginalMember(
      owner = "client!bj",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      while(true) {
         class289 var2;
         synchronized(this) {
            while(true) {
               if (this.field3240) {
                  return;
               }

               if (this.field3250 != null) {
                  var2 = this.field3250;
                  this.field3250 = this.field3250.field3825;
                  if (this.field3250 == null) {
                     this.field3259 = null;
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
            int var3 = var2.field3831;
            if (~var3 == -2) {
               if (class792.method5708(-25005) < field3244) {
                  throw new IOException();
               }

               var2.field3830 = new Socket(InetAddress.getByName((String)var2.field3828), var2.field3829);
            } else if (~var3 != -23) {
               if (var3 == 2) {
                  Thread var4 = new Thread((Runnable)var2.field3828);
                  var4.setDaemon(true);
                  var4.start();
                  var4.setPriority(var2.field3829);
                  var2.field3830 = var4;
               } else if (var3 != 4) {
                  if (~var3 == -9) {
                     Object[] var5 = (Object[])var2.field3828;
                     if (this.field3257 && ((Class)var5[0]).getClassLoader() == null) {
                        throw new SecurityException();
                     }

                     var2.field3830 = ((Class)var5[0]).getDeclaredMethod((String)var5[1], (Class[])var5[2]);
                  } else if (~var3 == -10) {
                     Object[] var6 = (Object[])var2.field3828;
                     if (this.field3257 && ((Class)var6[0]).getClassLoader() == null) {
                        throw new SecurityException();
                     }

                     var2.field3830 = ((Class)var6[0]).getDeclaredField((String)var6[1]);
                  } else if (~var3 == -19) {
                     Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                     var2.field3830 = var7.getContents((Object)null);
                  } else if (var3 == 19) {
                     Transferable var8 = (Transferable)var2.field3828;
                     Clipboard var9 = Toolkit.getDefaultToolkit().getSystemClipboard();
                     var9.setContents(var8, (ClipboardOwner)null);
                  } else {
                     if (!this.field3257) {
                        throw new Exception("");
                     }

                     if (~var3 != -4) {
                        if (~var3 == -22) {
                           if (field3244 > class792.method5708(-25005)) {
                              throw new IOException();
                           }

                           var2.field3830 = InetAddress.getByName((String)var2.field3828).getAddress();
                        } else if (~var3 != -6) {
                           if (var3 == 6) {
                              Frame var10 = new Frame(field3270[21]);
                              var2.field3830 = var10;
                              var10.setResizable(false);
                              if (!this.field3265) {
                                 Class.forName(field3270[29]).getMethod(field3270[18], field3266 != null ? field3266 : (field3266 = method1957(field3270[17])), Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field3262, var10, new Integer(var2.field3829 >>> 16), new Integer(var2.field3829 & 65535), new Integer(var2.field3827 >> 16), new Integer(65535 & var2.field3827));
                              } else {
                                 this.field3254.method1145(var2.field3829 >>> 16, var10, var2.field3827 >> 16, var2.field3829 & 65535, 104, 65535 & var2.field3827);
                              }
                           } else if (~var3 == -8) {
                              if (!this.field3265) {
                                 Class.forName(field3270[29]).getMethod(field3270[27]).invoke(this.field3262);
                              } else {
                                 this.field3254.method1147(-56, (Frame)var2.field3828);
                              }
                           } else if (var3 == 12) {
                              class468 var11 = method1939(field3243, (String)var2.field3828, -79, field3256);
                              var2.field3830 = var11;
                           } else if (~var3 == -14) {
                              class468 var12 = method1939(field3243, (String)var2.field3828, -114, "");
                              var2.field3830 = var12;
                           } else if (this.field3257 && ~var3 == -15) {
                              int var13 = var2.field3829;
                              int var14 = var2.field3827;
                              if (!this.field3265) {
                                 Class.forName(field3270[19]).getDeclaredMethod(field3270[23], Integer.TYPE, Integer.TYPE).invoke(this.field3255, new Integer(var13), new Integer(var14));
                              } else {
                                 this.field3242.method2953(var14, var13, 9341);
                              }
                           } else if (this.field3257 && ~var3 == -16) {
                              boolean var15 = ~var2.field3829 != -1;
                              Component var16 = (Component)var2.field3828;
                              if (this.field3265) {
                                 this.field3242.method2954((byte)-51, var16, var15);
                              } else {
                                 Class.forName(field3270[19]).getDeclaredMethod(field3270[20], field3267 != null ? field3267 : (field3267 = method1957(field3270[26])), Boolean.TYPE).invoke(this.field3255, var16, new Boolean(var15));
                              }
                           } else if (!this.field3265 && ~var3 == -18) {
                              Object[] var21 = (Object[])var2.field3828;
                              Class.forName(field3270[19]).getDeclaredMethod(field3270[14], field3267 != null ? field3267 : (field3267 = method1957(field3270[26])), field3268 != null ? field3268 : (field3268 = method1957(field3270[13])), Integer.TYPE, Integer.TYPE, field3269 != null ? field3269 : (field3269 = method1957(field3270[28]))).invoke(this.field3255, (Component)var21[0], (int[])var21[1], new Integer(var2.field3829), new Integer(var2.field3827), (Point)var21[2]);
                           } else {
                              if (var3 != 16) {
                                 throw new Exception("");
                              }

                              try {
                                 if (!field3248.startsWith(field3270[12])) {
                                    throw new Exception();
                                 }

                                 String var17 = (String)var2.field3828;
                                 if (!var17.startsWith(field3270[24]) && !var17.startsWith(field3270[25])) {
                                    throw new Exception();
                                 }

                                 String var18 = field3270[16];
                                 int var19 = 0;

                                 while(true) {
                                    if (~var17.length() >= ~var19) {
                                       Runtime.getRuntime().exec(field3270[15] + var17 + "\"");
                                       var2.field3830 = null;
                                       break;
                                    }

                                    if (var18.indexOf(var17.charAt(var19)) == -1) {
                                       throw new Exception();
                                    }

                                    ++var19;
                                 }
                              } catch (Exception var31) {
                                 var2.field3830 = var31;
                                 throw var31;
                              }
                           }
                        } else if (!this.field3265) {
                           var2.field3830 = Class.forName(field3270[29]).getMethod(field3270[22]).invoke(this.field3262);
                        } else {
                           var2.field3830 = this.field3254.method1146(0);
                        }
                     } else {
                        if (class792.method5708(-25005) < field3244) {
                           throw new IOException();
                        }

                        String var22 = (255 & var2.field3829 >> 24) + "." + ((var2.field3829 & 16760351) >> 16) + "." + ((65463 & var2.field3829) >> 8) + "." + (var2.field3829 & 255);
                        var2.field3830 = InetAddress.getByName(var22).getHostName();
                     }
                  }
               } else {
                  if (~class792.method5708(-25005) > ~field3244) {
                     throw new IOException();
                  }

                  var2.field3830 = new DataInputStream(((URL)var2.field3828).openStream());
               }
            } else {
               if (~field3244 < ~class792.method5708(-25005)) {
                  throw new IOException();
               }

               try {
                  var2.field3830 = class595.method4347(var2.field3829, (String)var2.field3828, (byte)83).method858(107);
               } catch (class737 var29) {
                  var2.field3830 = var29.getMessage();
                  throw var29;
               }
            }

            var2.field3826 = 1;
         } catch (ThreadDeath var32) {
            throw var32;
         } catch (Throwable var33) {
            var2.field3826 = 2;
         }

         synchronized(var2) {
            var2.notify();
         }
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;B)Lvea;"
   )
   public final class289 method1937(Class arg0, Class[] arg1, String arg2, byte arg3) {
      int var5 = -49 % ((-7 - arg3) / 55);
      return this.method1951(0, (byte)120, new Object[]{arg0, arg2, arg1}, 8, 0);
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(BLjava/awt/Frame;)Lvea;"
   )
   public final class289 method1938(byte arg0, Frame arg1) {
      if (arg0 <= 66) {
         this.method1948((byte)-49);
      }

      return this.method1951(0, (byte)87, arg1, 7, 0);
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(ILjava/lang/String;ILjava/lang/String;)Lti;"
   )
   private static final class468 method1939(int arg0, String arg1, int arg2, String arg3) {
      String var4;
      if (arg0 != 33) {
         if (arg0 != 34) {
            var4 = field3270[2] + arg3 + field3270[1] + arg1 + field3270[6];
         } else {
            var4 = field3270[2] + arg3 + field3270[1] + arg1 + field3270[8];
         }
      } else {
         var4 = field3270[2] + arg3 + field3270[1] + arg1 + field3270[4];
      }

      String[] var5 = new String[]{field3270[9], field3270[0], field3253, field3270[5], field3270[7], field3270[10], field3270[3], ""};

      for(int var6 = 0; ~var5.length < ~var6; ++var6) {
         String var7 = var5[var6];
         if (var7.length() <= 0 || (new File(var7)).exists()) {
            try {
               return new class468(new File(var7, var4), field3270[11], 10000L);
            } catch (Exception var9) {
            }
         }
      }

      if (arg2 >= -66) {
         field3244 = 31L;
      }

      return null;
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lvea;"
   )
   public final class289 method1940(String arg0, Class arg1, int arg2) {
      return arg2 != 6919 ? null : this.method1951(0, (byte)89, new Object[]{arg1, arg0}, 9, 0);
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(Ljava/net/URL;Z)Lvea;"
   )
   public final class289 method1941(URL arg0, boolean arg1) {
      return arg1 ? null : this.method1951(0, (byte)110, arg0, 4, 0);
   }

   @OriginalMember(
      owner = "client!bj",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method1942(byte arg0) {
      if (arg0 != 39) {
         this.method1949(9, 12, 84, -13, 91);
      }

      field3244 = 5000L + class792.method5708(-25005);
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Lvea;"
   )
   public final class289 method1943(String arg0, int arg1) {
      return arg1 != 26502 ? null : this.method1951(0, (byte)87, arg0, 16, 0);
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(ZILjava/lang/String;I)Lvea;"
   )
   public final class289 method1944(boolean arg0, int arg1, String arg2, int arg3) {
      return arg1 != 30526 ? null : this.method1951(arg3, (byte)98, arg2, arg0 ? 22 : 1, 0);
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(I)Ljava/lang/Object;"
   )
   public final Object method1945(int arg0) {
      if (arg0 != 8) {
         field3258 = null;
      }

      return this.field3238;
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(Ljava/lang/String;ZB)Lvea;"
   )
   public final class289 method1946(String arg0, boolean arg1, byte arg2) {
      int var4 = 14 / ((-2 - arg2) / 50);
      return !arg1 ? this.method1951(0, (byte)112, arg0, 13, 0) : this.method1951(0, (byte)109, arg0, 12, 0);
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(BLjava/io/File;[B)Z"
   )
   public final boolean method1947(byte arg0, File arg1, byte[] arg2) {
      try {
         FileOutputStream var4 = new FileOutputStream(arg1);
         var4.write(arg2, 0, arg2.length);
         var4.close();
         return arg0 >= -46 ? true : true;
      } catch (IOException var5) {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(B)Lvea;"
   )
   public final class289 method1948(byte arg0) {
      if (arg0 != -35) {
         field3248 = null;
      }

      return this.method1951(0, (byte)90, (Object)null, 5, 0);
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(IIIII)Lvea;"
   )
   public final class289 method1949(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg2 < 81) {
         this.method1938((byte)-127, (Frame)null);
      }

      return this.method1951((arg1 << 16) + arg0, (byte)66, (Object)null, 6, (arg3 << 16) - -arg4);
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(II)Lvea;"
   )
   public final class289 method1950(int arg0, int arg1) {
      if (arg0 != 3) {
         this.method1942((byte)64);
      }

      return this.method1951(arg1, (byte)105, (Object)null, 3, 0);
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(IBLjava/lang/Object;II)Lvea;"
   )
   private final class289 method1951(int arg0, byte arg1, Object arg2, int arg3, int arg4) {
      class289 var6 = new class289();
      var6.field3828 = arg2;
      if (arg1 <= 58) {
         this.field3252 = null;
      }

      var6.field3827 = arg4;
      var6.field3829 = arg0;
      var6.field3831 = arg3;
      synchronized(this) {
         if (this.field3259 == null) {
            this.field3259 = this.field3250 = var6;
         } else {
            this.field3259.field3825 = var6;
            this.field3259 = var6;
         }

         this.notify();
         return var6;
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(II[ILjava/awt/Point;Ljava/awt/Component;I)Lvea;"
   )
   public final class289 method1952(int arg0, int arg1, int[] arg2, Point arg3, Component arg4, int arg5) {
      if (arg1 != -27509) {
         this.field3246 = null;
      }

      return this.method1951(arg5, (byte)123, new Object[]{arg4, arg2, arg3}, 17, arg0);
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(ILjava/lang/String;)Lti;"
   )
   public static final class468 method1953(int arg0, String arg1) {
      if (arg0 != 7) {
         method1939(125, (String)null, 18, (String)null);
      }

      return method1939(field3243, arg1, -121, field3256);
   }

   @OriginalMember(
      owner = "client!bj",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method1954(int arg0) {
      synchronized(this) {
         this.field3240 = true;
         this.notifyAll();
      }

      try {
         this.field3251.join();
      } catch (InterruptedException var9) {
      }

      if (this.field3249 != null) {
         try {
            this.field3249.method3435(false);
         } catch (IOException var8) {
         }
      }

      if (this.field3260 != null) {
         try {
            this.field3260.method3435(false);
         } catch (IOException var7) {
         }
      }

      if (this.field3252 != null) {
         for(int var3 = 0; var3 < this.field3252.length; ++var3) {
            if (this.field3252[var3] != null) {
               try {
                  this.field3252[var3].method3435(false);
               } catch (IOException var6) {
               }
            }
         }
      }

      int var4 = 104 / ((arg0 - -8) / 39);
      if (this.field3246 != null) {
         try {
            this.field3246.method3435(false);
         } catch (IOException var5) {
         }
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method1955(int arg0) {
      if (arg0 != 11405) {
         this.method1956((Runnable)null, -3, 24);
      }

      if (!this.field3257) {
         return false;
      } else if (!this.field3265) {
         return this.field3262 != null;
      } else {
         return this.field3254 != null;
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(Ljava/lang/Runnable;II)Lvea;"
   )
   public final class289 method1956(Runnable arg0, int arg1, int arg2) {
      if (arg1 > -75) {
         this.run();
      }

      return this.method1951(arg2, (byte)80, arg0, 2, 0);
   }

   @OriginalMember(
      owner = "client!bj",
      name = "<init>",
      descriptor = "(ILjava/lang/String;IZ)V"
   )
   public class255(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
      field3263 = field3270[45];
      field3256 = arg1;
      field3258 = field3270[47];
      this.field3257 = arg3;
      field3243 = arg0;

      try {
         field3263 = System.getProperty(field3270[31]);
         field3258 = System.getProperty(field3270[38]);
      } catch (Exception var20) {
      }

      if (~field3263.toLowerCase().indexOf(field3270[35]) != 0) {
         this.field3265 = true;
      }

      try {
         field3264 = System.getProperty(field3270[36]);
      } catch (Exception var19) {
         field3264 = field3270[45];
      }

      field3248 = field3264.toLowerCase();

      try {
         field3245 = System.getProperty(field3270[39]).toLowerCase();
      } catch (Exception var18) {
         field3245 = "";
      }

      try {
         field3261 = System.getProperty(field3270[33]).toLowerCase();
      } catch (Exception var17) {
         field3261 = "";
      }

      try {
         field3253 = System.getProperty(field3270[30]);
         if (field3253 != null) {
            field3253 = field3253 + "/";
         }
      } catch (Exception var16) {
      }

      if (field3253 == null) {
         field3253 = field3270[44];
      }

      try {
         this.field3241 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var15) {
      }

      if (!this.field3265) {
         try {
            field3239 = Class.forName(field3270[26]).getDeclaredMethod(field3270[32], Boolean.TYPE);
         } catch (Exception var14) {
         }

         try {
            field3247 = Class.forName(field3270[34]).getDeclaredMethod(field3270[48], Boolean.TYPE);
         } catch (Exception var13) {
         }
      }

      class48.method407(field3243, 0, field3256);
      if (this.field3257) {
         this.field3246 = new class468(class48.method405(-27954, field3243, field3270[43], (String)null), field3270[11], 25L);
         this.field3249 = new class468(class48.method406(field3270[40], (byte)110), field3270[11], 314572800L);
         this.field3260 = new class468(class48.method406(field3270[37], (byte)87), field3270[11], 1048576L);
         this.field3252 = new class468[arg2];

         for(int var5 = 0; ~var5 > ~arg2; ++var5) {
            this.field3252[var5] = new class468(class48.method406(field3270[42] + var5, (byte)97), field3270[11], 1048576L);
         }

         if (this.field3265) {
            try {
               this.field3238 = Class.forName(field3270[41]).newInstance();
            } catch (Throwable var12) {
            }
         }

         try {
            if (!this.field3265) {
               this.field3262 = Class.forName(field3270[29]).newInstance();
            } else {
               this.field3254 = new class137();
            }
         } catch (Throwable var11) {
         }

         try {
            if (!this.field3265) {
               this.field3255 = Class.forName(field3270[19]).newInstance();
            } else {
               this.field3242 = new class385();
            }
         } catch (Throwable var10) {
         }
      }

      if (this.field3257 && !this.field3265) {
         ThreadGroup var6 = Thread.currentThread().getThreadGroup();

         for(ThreadGroup var7 = var6.getParent(); var7 != null; var7 = var7.getParent()) {
            var6 = var7;
         }

         Thread[] var8 = new Thread[1000];
         var6.enumerate(var8);

         for(int var9 = 0; var9 < var8.length; ++var9) {
            if (var8[var9] != null && var8[var9].getName().startsWith(field3270[46])) {
               var8[var9].setPriority(1);
            }
         }
      }

      this.field3240 = false;
      this.field3251 = new Thread(this);
      this.field3251.setPriority(10);
      this.field3251.setDaemon(true);
      this.field3251.start();
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method1957(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1958(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1959(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
